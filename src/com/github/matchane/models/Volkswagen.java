package com.github.matchane.models;

public class Volkswagen {
	

    public static String MANUFACTURER = "Volkswagen";

    private String modelId;
    private int year;
    private String engine;
    private String transmission;
    private int doors;


    public Volkswagen(String modelId, int year, String engine, String transmission, int doors) {
        this.modelId = modelId;
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
        this.doors = doors;
    }

    
    @Override
    public String toString() {
        return "Volkswagen{" +
                "manufacturer='" + Volkswagen.MANUFACTURER + '\'' +
                "modelId='" + modelId + '\'' +
                ", year='" + year + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", doors=" + doors +
                '}';
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
