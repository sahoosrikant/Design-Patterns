package org.example.dto;

import org.example.enums.CabType;

public class RequestRTO {

    private CabType cabType;
    private double distanceInKm;

    public RequestRTO(CabType cabType, double distanceInKm) {
        this.cabType = cabType;
        this.distanceInKm = distanceInKm;
    }

    public CabType getCabType() {
        return cabType;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }
}
