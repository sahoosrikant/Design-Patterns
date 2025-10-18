package org.example;

public class PhoneDisplay implements Observer{
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("(Phone) Display: Temperature is " + temp + "°C, Humidity level is " + humidity
                                + " and Pressure is "+pressure);
    }
}
