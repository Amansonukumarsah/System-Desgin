// package Parking;

import java.util.ArrayList;
import java.util.List;

// manage the parking for two wheleer
public class manageTwoWheleerParking extends parkingManager {

    static List<parkingSlot> lst = new ArrayList<>(400);

    manageTwoWheleerParking() {
        super(lst);
    }

}