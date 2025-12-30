package org.example.factory;

import org.example.enums.CabType;
import org.example.model.Cab;
import org.example.model.MiniCab;
import org.example.model.SUVCab;
import org.example.model.SedanCab;

public class CabFactory {
    public static Cab getCab(CabType cabType){
        switch(cabType){
            case MINI :
                return new MiniCab();
            case SEDAN:
                return new SedanCab();
            case SUV:
                return new SUVCab();
            default:
                throw new IllegalArgumentException("Invalid CabType");
        }
    }
}
