package com.github.matchane.models.cars;


public class Chevrolet extends Car {
    public static String MANUFACTURER = "Chevrolet ";

    public Chevrolet(String modelId, int year, String engine, String transmission, int doors) {
        super(modelId, year, engine, transmission, doors);
    }

    public String toString() {
        return "**** " +
                "manufacturer='" + MANUFACTURER + '\'' +
                ", modelId='" + getModelId() + '\'' +
                ", year='" + getYear() + '\'' +
                ", engine='" + getEngine() + '\'' +
                ", transmission='" + getTransmission() + '\'' +
                ", doors=" + getDoors() +
                " ****";
    }
}
