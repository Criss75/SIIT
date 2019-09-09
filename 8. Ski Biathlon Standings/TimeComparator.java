package com.Criss75;

import java.util.Comparator;

public class TimeComparator implements Comparator<Athletes> {
    @Override
    public int compare(Athletes a1, Athletes a2) {
        return a1.getResult()-a2.getResult();
    }
}
