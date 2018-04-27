package com.epam.java_fundamentals.oop.stationary;

import java.util.Comparator;

public class StationaryNameComparator implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
