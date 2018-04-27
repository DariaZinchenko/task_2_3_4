package com.epam.java_fundamentals.oop.stationary;

import java.util.Comparator;

public class StationaryPriseComparator implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        return Double.compare(o1.getPrise(), o2.getPrise());
    }
}