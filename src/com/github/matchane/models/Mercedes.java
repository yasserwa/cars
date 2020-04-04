package com.github.matchane.models;


public class Mercedes extends Car {
    public static String MANUFACTURER = "Mercedes";

    public Mercedes(String modelId, int year, String engine, String transmission, int doors) {
        super(modelId, year, engine, transmission, doors);
    }
}
