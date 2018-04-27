package com.epam.java_fundamentals.oop;

import com.epam.java_fundamentals.oop.stationary.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Workspase w1 = new Workspase(1, Stationery.getBasicKit());
        System.out.println("Total cost of stacionary basic kit: " + w1.getTotalCost());

        ArrayList<Stationery> basicKit_1 = Stationery.getBasicKit();
        ArrayList<Stationery> basicKit_2 = Stationery.getBasicKit();

        basicKit_1.sort(new StationaryNameComparator());
        basicKit_2.sort(new StationaryPriseComparator());

        System.out.println(basicKit_1.toString());
        System.out.println(basicKit_2);
    }
}
