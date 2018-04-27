package com.epam.java_fundamentals.oop;

import com.epam.java_fundamentals.oop.stationary.Stationery;

import java.awt.*;

public class WritingAccessories extends Stationery {
    private int width;
    private Color color;

    public WritingAccessories() {
        this("", "", 0, 1, Color.BLACK);
    }

    public WritingAccessories(String name, String producerName, double prise, int width, Color color) {
        super(name, producerName, prise);
        this.width = width;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
