package org.example;

public class FarToCel {
    public static int convertFar(double far) {
        return (int) Math.round((far - 32) * 5 / 9);
    }

    public static double KelvinToCelsius(double kelvin) {
        return (kelvin - 273.15);
    }

    public static double KelvinToFahrenheit(double kelvin) {
        return ((kelvin - 273.15) * 9 / 5 + 32);
    }
}