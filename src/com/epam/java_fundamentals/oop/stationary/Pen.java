package com.epam.java_fundamentals.oop.stationary;

import com.epam.java_fundamentals.oop.WritingAccessories;

import java.awt.*;

public class Pen extends WritingAccessories {
    private TypeOfPen type;

    public Pen() {
        this("", "", 0, 1, Color.BLACK, TypeOfPen.BALLPOINT_PEN);
    }

    public Pen(String name, String producerName, double prise, int width, Color color, TypeOfPen type) {
        super(name, producerName, prise, width, color);
        this.type = type;
    }
}
