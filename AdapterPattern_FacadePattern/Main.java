package org.example;
//MainClass
import org.example.facade_layer.HotelBookingFacade;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HotelBookingFacade bookingFacade = new HotelBookingFacade();

        bookingFacade.bookOyo("Srikant");
        bookingFacade.bookMarriot("Sridhar");
        bookingFacade.bookTaj("Susama");
    }
}