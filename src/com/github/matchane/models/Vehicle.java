package com.github.matchane.models;

/**
 * An abstract class representing a Vehicle
 */
public abstract class Vehicle {
    private static String MANUFACTURER;

    private String modelId;
    private int year;
    private String engine;

    public Vehicle(String modelId, int year, String engine) {
        this.modelId = modelId;
        this.year = year;
        this.engine = engine;
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
}
