package Vending_Machine.imp.inventory;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    private Map<productType, Integer> stockProduct;

    public Stock() {

        stockProduct = new HashMap<>();

        for (productType productType : productType.values()) {
            stockProduct.put(productType, 0);
        }
    }

    public Integer getProduct(productType productName) {
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
