package org.example.model;

public abstract class Cab {

    protected double baseFare;
    protected double ratePerKm;

    public Cab(double baseFare, double ratePerKm) {
        this.baseFare = baseFare;
        this.ratePerKm = ratePerKm;
    }

    public double calculateFare (double distanceInKm){
        return baseFare + (ratePerKm * distanceInKm);
    }

    public abstract  String getCabType();
}
