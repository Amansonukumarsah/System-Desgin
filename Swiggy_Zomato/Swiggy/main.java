package Swiggy_Zomato.Swiggy;

import java.util.HashMap;
import java.util.Map;

import Swiggy_Zomato.Swiggy.Details.user;
import Swiggy_Zomato.Swiggy.Food.dish;
import Swiggy_Zomato.Swiggy.Food.order;
import Swiggy_Zomato.Swiggy.Food.resturant;

public class main {

    public static void main(String[] args) {
        System.out.println("Shree Gaynesh!!");

        // Demo data for Dish
        new dish(null, null, 0);
        // demo data for resturant

        // Add new resturant();
        // Add users
        new user("Aman", "6200894044", "Bihar");
        new user("Sonu", "7808435522", "Delhi");
        new user("Rahul", "7739930674", "USA");

        // ..........................................................................

        // create order
        Map<dish, Integer> cart = new HashMap<>();
        cart.put(new dish("panner sabji", "Veg", 10), 1);
        cart.put(new dish("roti", "Veg", 100), 5);
        order order1 = new order(1,
                new user("SAAK", "6200894044", "Bihar"),
                new resturant("MataRani", "Infocity"),
                cart);
        //second order 
        Map<dish, Integer> cart = new HashMap<>();
        cart.put(new dish("panner sabji", "Veg", 10), 1);
        cart.put(new dish("roti", "Veg", 100), 5);
        order order1 = new order(1,
                new user("SAAK", "6200894044", "Bihar"),
                new resturant("MataRani", "Infocity"),
                cart);
        // for handling the static methode to non static methode
        orderManager orderManager = new orderManager();
        orderManager.createOrder(order1);
    }
}
