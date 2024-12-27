// package Parking;

// it contains the details of parking
public class parkingSlot {

    private int id;
    private int price;
    boolean isEmpty;
    String vehiclesType;

    // geeter and setter

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public String getvehiclesType() {
        return vehiclesType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public void setvehiclesType(String vehiclesType) {
        this.vehiclesType = vehiclesType;
    }
}
