package org.example.model;

public class SedanCab extends Cab{

    public SedanCab() {
        super(60, 15);
    }

    @Override
    public String getCabType() {
        return "SEDAN";
    }
}
