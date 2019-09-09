package com.Criss75;

import java.util.Comparator;

public class ParkingCompare implements Comparator<Employee> {
    @Override
        public int compare(Employee o1, Employee o2) {
            boolean e1 = o1.isHasParking();
            boolean e2 = o2.isHasParking();
        if (e1 && !e2){
            return 1;
        }
        if (e2 && !e1){
            return -1;
        }
        Integer p1 = o1.getSeniority();
        Integer p2 = o2.getSeniority();
        return p1.compareTo(p2);
    }
}
