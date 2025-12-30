package org.example.model;

public class SUVCab extends Cab{
    public SUVCab() {
        super(70, 20);
    }

    @Override
    public String getCabType() {
        return "SUV";
    }
}
