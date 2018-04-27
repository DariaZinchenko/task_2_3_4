package com.epam.java_fundamentals.oop.stationary;

public class Stapler extends BondingTool {
    private int stapleSize;

    public Stapler() {
        this("","", 0, 0, 0);
    }

    public Stapler(String name, String producerName, double prise, int maxSheetsQuantity, int stapleSize) {
        super(name, producerName, prise, maxSheetsQuantity);
        this.stapleSize = stapleSize;
    }

    public int getStapleSize() {
        return stapleSize;
    }

    public void setStapleSize(int stapleSize) {
        this.stapleSize = stapleSize;
    }
}
