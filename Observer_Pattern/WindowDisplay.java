package org.example;

public class WindowDisplay implements Observer{
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("(Window) Display: Temperature is " + temp + "°C, Humidity level is " + humidity
                + " and Pressure is "+pressure);
    }
}
