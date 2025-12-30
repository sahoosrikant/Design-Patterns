package org.example;

import org.example.dto.RequestRTO;
import org.example.enums.CabType;
import org.example.factory.CabFactory;
import org.example.model.Cab;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RequestRTO requestRTO = new RequestRTO(CabType.SUV, 1200.0);

        Cab cab = CabFactory.getCab(requestRTO.getCabType());
        double totalFare = cab.calculateFare(requestRTO.getDistanceInKm());

        System.out.println("Cab Type :"+ cab.getCabType() + " Total Fare :"+ totalFare);
        }
    }