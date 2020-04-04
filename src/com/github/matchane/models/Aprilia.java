package com.github.matchane.models;

public class Aprilia extends Car {
    private static String MANUFACTURER = "Aprilia";

    public Aprilia(String modelId, int year, String engine, String transmission, int doors) {
        super(modelId, year, engine, transmission, doors);
    }
}
