package org.example;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        WindowDisplay windowDisplay = new WindowDisplay();

        weatherData.registerObserver(phoneDisplay);
        weatherData.registerObserver(windowDisplay);

        weatherData.setMeasurement(45, 65, 30.48F);
        weatherData.setMeasurement(43, 68, 32.47F);
        weatherData.setMeasurement(38, 67, 34.51F);
        }
    }
