// package Parking;

// handle the entry of vichles and their details and avilable parking

public class entranceGate {

    parkingManager parkingManager = new parkingManager(null);

    boolean isEmpty = parkingManager.findParkingSlot();
    {
        parkingManager.parkVehicles("TwoWheller", isEmpty);
    }

}
