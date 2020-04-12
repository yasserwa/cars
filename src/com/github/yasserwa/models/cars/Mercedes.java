package com.github.yasserwa.models.cars;


public class Mercedes extends Car {
    public static String MANUFACTURER = "Mercedes";

    public Mercedes(String modelId, int year, String engine, String transmission, int doors) {
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
