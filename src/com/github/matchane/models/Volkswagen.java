package com.github.matchane.models;

public class Volkswagen extends Car{
    public static String MANUFACTURER = "Volkswagen";

    public Volkswagen(String modelId, int year, String engine, String transmission, int doors) {
        super(modelId, year, engine, transmission, doors);
    }
}
