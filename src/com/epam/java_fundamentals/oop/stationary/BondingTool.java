package com.epam.java_fundamentals.oop.stationary;

public class BondingTool extends Stationery {
    private int maxSheetsQuantity;

    public BondingTool() {
        this("","", 0, 0);
    }

    public BondingTool(String name, String producerName, double prise, int maxSheetsQuantity) {
        super(name, producerName, prise);
        this.maxSheetsQuantity = maxSheetsQuantity;
    }

    public int getMaxSheetsQuantity() {
        return maxSheetsQuantity;
    }

    public void setMaxSheetsQuantity(int maxSheetsQuantity) {
        this.maxSheetsQuantity = maxSheetsQuantity;
    }
}
