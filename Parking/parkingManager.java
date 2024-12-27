// package Parking;

// import parkingSlot;

import java.util.List;

// Parking Manager :- it manage the space of parking
public class parkingManager {
    List<parkingSlot> lst;

    // make a has a relationship/or take a reference of parking.
    private parkingSlot parkingSlot;

    parkingManager(List lst) {
        this.lst = lst;
    }

    public boolean findParkingSlot(List lst) {

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == null) {
                return true;
            }
        }
        return false;
    }

    public void addParkingSlot() {

    }

    public void removeParkingSlot() {
    }

    public void parkVehicles(String vehiclesType, boolean isEmpty) {

        parkingSlot.vehiclesType = vehiclesType;
        parkingSlot.isEmpty = isEmpty;
        // this.lst.add(parkingSlot);

    }

    public void removeVehicles(boolean isEmpty, List lst) {
        parkingSlot.isEmpty = isEmpty;
        lst.remove(1);
    }

}
