package org.example.model;

public class MiniCab extends Cab{

    public MiniCab() {
        super(50, 20);
    }

    @Override
    public String getCabType() {
        return "MINI";
    }
}
