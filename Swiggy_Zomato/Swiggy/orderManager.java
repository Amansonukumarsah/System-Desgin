package Swiggy_Zomato.Swiggy;


import Swiggy_Zomato.Swiggy.Details.user;
import Swiggy_Zomato.Swiggy.Food.foodManager;
import Swiggy_Zomato.Swiggy.Food.order;
import Swiggy_Zomato.Swiggy.Food.resturant;

import Swiggy_Zomato.Swiggy.Food.foodManager;

public class orderManager {

    foodManager foodManager = new foodManager();


    //
    public void notification(String phoneNumber) {

    // FOOD
    private Integer orderId;
    private Integer resturantId;

    // Delivery Address
    private Integer resturantLocationPineCode;
    private Integer orderPinCode;

    //
    public void notification(Integer orderId) {


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


    public void foodManager(int orderId, int resturantId) {
        foodManager.searchResturant(orderId, resturantId);
    }

    // deliveryManager
    public void deliveryManager(int resturantLocationPineCode, int orderPinCode, int orderId, int resturantId) {

    }

    public void createOrder() {
        notification(orderId);
        foodManager(orderId, resturantId);
        deliveryManager(resturantLocationPineCode, orderPinCode, orderId, resturantId);
    }

    // getter and setter
    public void setorderId(int orderId) {
        this.orderId = orderId;
    }

    public void setResturantId(int resturantId) {
        this.resturantId = resturantId;
    }

    public void resturantLocationPineCode(int resturantLocationPineCode) {
        this.resturantLocationPineCode = resturantLocationPineCode;
    }

    public void orderPinCode(int orderPinCode) {
        this.orderPinCode = orderPinCode;
    }

    public Integer getorderId() {
        return this.orderId;
    }

    public Integer getResturantId() {
        return this.resturantId;
    }

    public Integer getResturantLocationPineCode() {
        return this.resturantLocationPineCode;
    }

    public Integer getorderPinCode() {
        return this.orderPinCode;
    }

}
