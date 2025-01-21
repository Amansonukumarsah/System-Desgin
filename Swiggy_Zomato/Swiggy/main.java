package Swiggy_Zomato.Swiggy;

import java.util.HashMap;
import java.util.Map;

import Swiggy_Zomato.Swiggy.Details.user;
import Swiggy_Zomato.Swiggy.Food.dish;

public class main {

    public static void main(String[] args) {
        System.out.println("Shree Gaynesh!!");

        // demo data for resturant
        // new resturant();
        // Add users
        new user("Aman", "6200894044", "Bihar");
        new user("Sonu", "7808435522", "Delhi");
        new user("Rahul", "7739930674", "USA");

        // create order
        Map<dish, Integer> cart = new HashMap<>();
        cart.put(new dish("panner sabji", 10), 1);
        cart.put(new dish("roti", 100), 5);
        orderManager.createOrder(orderId);

    }
}
