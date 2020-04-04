package com.github.matchane.models;


public class Chevrolet extends Car {
    public static String MANUFACTURER = "Chevrolet ";

    public Chevrolet(String modelId, int year, String engine, String transmission, int doors) {
        super(modelId, year, engine, transmission, doors);
    }
}
