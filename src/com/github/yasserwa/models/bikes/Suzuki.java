package com.github.yasserwa.models.bikes;


public class Suzuki extends Bike {
    private static String MANUFACTURER = "Suzuki";

    public Suzuki(String modelId, int year, String engine, int topSpeed, boolean racingBike) {
        super(modelId, year, engine, topSpeed, racingBike);

    }

    public String toString() {
        return "**** " +
                "manufacturer='" + MANUFACTURER + '\'' +
                "modelId =" + getModelId() + '\'' +
                "year =" + getYear() + '\'' + "engine =" + '\'' + getEngine() + '\'' +
                "top Speed = " + getTopSpeed() + '\'' +
                "racing Bike = " + isRacingBike() + '\'' +
                " ****";
    } public int compareTo(Suzuki st) {
    	// TODO Auto-generated method stub
    	return st.getYear() - this.getYear();
    }
}

