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
        // 300.1 kelvin is 80.51F this is wrong -> ((kelvin - 273.15) * (9 / 5) + 32);
    }
    public static void main(String[] args) {
        System.out.println("32 Fahrenheit is " + convertFar(32) + " Celsius");
        System.out.println("273.15 Kelvin is " + KelvinToCelsius(273.15) + " Celsius");
        System.out.println("300.1 Kelvin is " + KelvinToFahrenheit(300.1) + " Fahrenheit");
    }
}