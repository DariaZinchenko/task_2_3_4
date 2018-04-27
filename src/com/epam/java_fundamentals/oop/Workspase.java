package com.epam.java_fundamentals.oop;

import com.epam.java_fundamentals.oop.stationary.Stationery;

import java.util.ArrayList;

public class Workspase {
    private int workspaseId;
    public ArrayList<Stationery> stationeryKit; // вид канцтовара и его количество

    public Workspase(int workspaseId) {
        this.workspaseId = workspaseId;
        this.stationeryKit = new ArrayList<Stationery>();
    }

    public Workspase(int workspaseId, ArrayList<Stationery> stationeryKit) {
        this.workspaseId = workspaseId;
        this.stationeryKit = stationeryKit;
    }

    public int getWorkspaseId() {
        return workspaseId;
    }

    public void setWorkspaseId(int workspaseId) {
        this.workspaseId = workspaseId;
    }

    public Double getTotalCost(){
        double totalCost = 0;
        for (Stationery s: stationeryKit)
            totalCost += s.getPrise();
        return totalCost;
    }
}
