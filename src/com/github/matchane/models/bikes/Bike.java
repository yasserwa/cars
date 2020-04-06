package com.github.matchane.models.bikes;

import com.github.matchane.models.Vehicle;

/**
 * An abstract class representing a Bike, specific car manufacturers will extend this class
 */
public abstract class Bike extends Vehicle {
    private static String MANUFACTURER;

    private int topSpeed;
    private boolean racingBike;


    public Bike(String modelId, int year, String engine, int topSpeed, boolean racingBike) {
        super(modelId, year, engine);
        this.topSpeed = topSpeed;
        this.racingBike = racingBike;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isRacingBike() {
        return racingBike;
    }

    public void setRacingBike(boolean racingBike) {
        this.racingBike = racingBike;
    }
}
