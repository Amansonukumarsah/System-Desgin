// package Parking;

import java.util.ArrayList;
import java.util.List;

// manage the parking for Four wheleer
public class manageFourWheleerParking extends parkingManager {
    static List<parkingSlot> lst = new ArrayList<>(400);

    manageFourWheleerParking() {
        super(lst);
    }
}