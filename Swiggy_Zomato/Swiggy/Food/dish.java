package Swiggy_Zomato.Swiggy.Food;

public class dish {

    private String name;
    private String type;
    private double price;

    // Constructor
    public dish(String name, String type, double price) {
        this.name = name;
        this.price = price;
    }

    // getter and setter
    public String getName() {
        return this.name;
    }

    public String getDescribe() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String type) {
        this.type = type;
    }

}
