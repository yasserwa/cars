package com.github.yasserwa.models.bikes;


public class Kawasaki extends Bike implements Comparable<Kawasaki> {
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
                ", top Speed='" + getTopSpeed() + '\'' +
                ", racing Bike=" + isRacingBike() +
                " ****";
    }

	@Override
	public int compareTo(Kawasaki q) {
		// TODO Auto-generated method stub
		
		return this.year - q.year;
	}
}
