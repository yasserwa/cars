package com.github.matchane.models.cars;

import com.github.matchane.models.Vehicle;

/**
 * An abstract class representing a Car, specific car manufacturers will extend this class
 */
public abstract class Car extends Vehicle {
    private static String MANUFACTURER;

    private String transmission;
    private int doors;


    public Car(String modelId, int year, String engine, String transmission, int doors) {
        super(modelId, year, engine);
        this.transmission = transmission;
        this.doors = doors;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
