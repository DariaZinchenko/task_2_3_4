package com.epam.java_fundamentals.oop.stationary;

public class Puncher extends BondingTool {
    private int numberOfHoles;

    public Puncher() {
        this("", "", 0, 0, 0);
    }

    public Puncher(String name, String producerName, double prise, int maxSheetsQuantity, int numberOfHoles) {
        super(name, producerName, prise, maxSheetsQuantity);
        this.numberOfHoles = numberOfHoles;
    }

    public int getNumberOfHoles() {
        return numberOfHoles;
    }

    public void setNumberOfHoles(int numberOfHoles) {
        this.numberOfHoles = numberOfHoles;
    }
}
