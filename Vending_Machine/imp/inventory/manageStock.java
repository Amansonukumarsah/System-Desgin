package Vending_Machine.imp.inventory;

public class manageStock {

    // Add Stock
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.displayProduct();
        stock.addProduct(productType.cake, 3);
        stock.displayProduct();

    }
    // public
    // public manageStock() {
    // stock.addProduct(productType.cake, 3);
    // }

}
