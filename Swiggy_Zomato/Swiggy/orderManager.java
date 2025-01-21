package Swiggy_Zomato.Swiggy;

import Swiggy_Zomato.Swiggy.Details.user;
import Swiggy_Zomato.Swiggy.Food.foodManager;
import Swiggy_Zomato.Swiggy.Food.order;
import Swiggy_Zomato.Swiggy.Food.resturant;

public class orderManager {

    foodManager foodManager = new foodManager();

    //
    public void notification(String phoneNumber) {

    }

    // FoodManager
    public void foodManager(resturant resturant) {
        foodManager.searchResturant(resturant.getClass(), resturant.getClass());
    }

    // deliveryManager
    public void deliveryManager(user user, resturant resturant) {

    }

    // this function split the food and delivery
    // so that we can handle the food managemant and delivery seperately
    public void createOrder(order order) {
        notification(order.getUser().getPhoneNumber());
        foodManager(order.getResturant());
        deliveryManager(order.getUser(), order.getResturant());
    }

}
