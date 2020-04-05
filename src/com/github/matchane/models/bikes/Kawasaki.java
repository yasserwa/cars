package com.github.matchane.models.bikes;

public class Kawasaki extends Bike {
    private static String MANUFACTURER = "YAMAHA";

    public Kawasaki(String modelId, int year, String engine, int topSpeed, boolean racingBike) {
        super(modelId, year, engine, topSpeed, racingBike);
    }

    public String toString() {
        return "**** " +
                "manufacturer='" + MANUFACTURER + '\'' +
                ", modelId='" + getModelId() + '\'' +
                ", year='" + getYear() + '\'' +
                ", engine='" + getEngine() + '\'' +
                ", transmission='" + getTopSpeed() + '\'' +
                ", doors=" + isRacingBike() +
                " ****";
    }
}
