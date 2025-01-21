package Swiggy_Zomato.Swiggy.Food;

import java.util.ArrayList;
import java.util.List;

public class dishAddOn {
    private String name;
    private String describe;
    private double price;
    List<Integer> addons = new ArrayList<>();

    dishAddOn(String name, String describe, double price) {
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public String getname() {
        return name;
    }

    public String getdish() {
        return describe;
    }

    public double getPrice() {
        return price;
    }

}
