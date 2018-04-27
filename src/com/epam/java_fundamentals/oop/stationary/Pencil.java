package com.epam.java_fundamentals.oop.stationary;

import com.epam.java_fundamentals.oop.WritingAccessories;

import java.awt.*;

public class Pencil extends WritingAccessories {
    protected HardnessOfLead hardness;

    public Pencil() {
        this("", "", 0, 1, Color.BLACK, HardnessOfLead.TM);
    }

    public Pencil(String name, String producerName, double prise, int width, Color color, HardnessOfLead hardness) {
        super(name, producerName, prise, width, color);
        this.hardness = hardness;
    }
}
