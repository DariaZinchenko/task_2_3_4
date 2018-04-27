package com.epam.java_fundamentals.oop.stationary;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Stationery implements Comparable<Stationery>{
    private String name;
    private String producerName;
    private double prise;

    public Stationery() {
        this("", "",0);
    }

    public Stationery(String name, String producerName, double prise) {
        this.name = name;
        this.prise = prise;
        this.producerName = producerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public static ArrayList<Stationery> getBasicKit (){
        ArrayList<Stationery> stationeryBasicKit = new ArrayList<>();

        stationeryBasicKit.add(new NoteBook("notebook_1","ErichKrause", 73.5, 60, PagePattern.CAGE));
        stationeryBasicKit.add(new Pen("pen_1","ErichKrause", 34.5, 2, Color.BLUE, TypeOfPen.BALLPOINT_PEN));
        stationeryBasicKit.add(new Pencil("pencil_1", "ErichKrause", 24.3, 2, Color.gray, HardnessOfLead.TM));
        stationeryBasicKit.add(new Stapler("stapler_1", "ErichKrause", 243.62, 50, 4));
        stationeryBasicKit.add(new Puncher("puncher_1", "ErichKrause", 34.5, 50, 2));

        return stationeryBasicKit;
    }

    @Override
    public int compareTo(Stationery o) {
        return Double.compare(prise, o.getPrise());
    }
}
