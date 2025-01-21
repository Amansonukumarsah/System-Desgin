package Swiggy_Zomato.Swiggy.Food;

import Swiggy_Zomato.Swiggy.Details.user;

public class order {

    private Integer id;
    user user;
    resturant resturant;
    dish dish;

    public order(Integer id, user user, resturant resturant,
            dish dish) {
        this.id = id;
        this.user = user;
        this.resturant = resturant;
        this.dish = dish;
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

    public dish getDish() {
        return dish;
    }

    public void setDish(dish dish) {
        this.dish = dish;
    }

    // print the Details
    @Override
    public String toString() {
        return "order [id=" + id + ", user=" + user + ", resturant=" + resturant + ", dish=" + dish + ", getId()="
                + getId() + ", getUser()=" + getUser() + ", getResturant()=" + getResturant() + ", getDish()="
                + getDish() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}
