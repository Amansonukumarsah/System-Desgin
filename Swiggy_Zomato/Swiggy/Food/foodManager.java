package Swiggy_Zomato.Swiggy.Food;

public class foodManager {

    resturant resturant = new resturant(null, null);

    private Integer orderId;
    private Integer resturantId;

    // Constructor
    // foodManager(int orderId, int resturantId) {
    // this.orderId = orderId;
    // this.resturantId = resturantId;
    // }

    public void searchResturant(int resturantId, int orderId) {
        resturant.prepareFood();
    }

    // Setter and Getter
    public void setorderId(int orderId) {
        this.orderId = orderId;
    }

    public void setResturantId(int resturantId) {
        this.resturantId = resturantId;
    }

    public Integer getorderId() {
        return this.orderId;
    }

    public Integer getResturantId() {
        return this.resturantId;
    }

}
