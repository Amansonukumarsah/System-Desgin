package Vending_Machine.imp.inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {

    public static class pair {

        private Integer item;
        private Integer price;

        pair(Integer item, Integer price) {
            this.item = item;
            this.price = price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public Integer getPrice() {
            return this.price;
        }

        public Integer getItem() {
            return this.item;
        }

        @Override
        public String toString() {
            return "(" + item + ", " + price + ")";
        }

    }

    private Map<productType, List<pair>> stockProduct;

    public Stock() {

        stockProduct = new HashMap<>();

        for (productType productType : productType.values()) {
            Map<Integer, Integer> priceItem = new HashMap<>();
            priceItem.put(0, 0);
            stockProduct.put(productType, priceItem);
        }
    }

    public Integer getProduct(productType productName) {
        Map<Integer, Integer> priceItem = stockProduct.get(productName);
        if (priceItem)
            return stockProduct.getOrDefault(stockProduct, 0);
    }

    public void addProduct(productType productName, int quantity) {
        stockProduct.put(productName, stockProduct.get(productName) + quantity);
    }

    public void reduceProduct(productType productName, int quantity) {
        if (stockProduct.containsKey(productName) && stockProduct.get(productName) >= quantity) {
            stockProduct.put(productName, stockProduct.get(productName) - quantity);
        } else {
            System.out.println("Insufficient stock for:" + productName);
        }
    }

    public void displayProduct() {
        for (Map.Entry<productType, Integer> entry : stockProduct.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
    }

}
