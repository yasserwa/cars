package com.github.matchane.models.bikes;

/**
 * An abstract class representing a Bike, specific car manufacturers will extend this class
 */
public abstract class Bike {
    private static String MANUFACTURER;

    private String modelId;
    private int year;
    private String engine;
    private int topSpeed;
    private boolean racingBike;


    public Bike(String modelId, int year, String engine, int topSpeed, boolean racingBike) {
        this.modelId = modelId;
        this.year = year;
        this.engine = engine;
        this.topSpeed = topSpeed;
        this.racingBike = racingBike;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
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
