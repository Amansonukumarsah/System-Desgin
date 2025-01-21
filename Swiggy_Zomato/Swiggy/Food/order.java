package Swiggy_Zomato.Swiggy.Food;

import java.util.Map;

import Swiggy_Zomato.Swiggy.Details.user;

public class order {

    private Integer id;
    user user;
    resturant resturant;
    Map<dish, Integer> cart;

    // Constructor
    public order(Integer id, user user, resturant resturant, Map<dish, Integer> cart) {
        this.id = id;
        this.user = user;
        this.resturant = resturant;
        this.cart = cart;
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public resturant getResturant() {
        return resturant;
    }

    public void setResturant(resturant resturant) {
        this.resturant = resturant;
    }

    // print the Details
    @Override
    public String toString() {
        return "order [id=" + id + ", user=" + user + ", resturant=" + resturant + ", dish=" + ", getId()="
                + getId() + ", getUser()=" + getUser() + ", getResturant()=" + getResturant() + ", getDish()="
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}
