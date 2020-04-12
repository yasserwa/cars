package com.github.yasserwa.models.cars;

public class Aprilia extends Car {
    private static String MANUFACTURER = "Aprilia";

    public Aprilia(String modelId, int year, String engine, String transmission, int doors) {
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
