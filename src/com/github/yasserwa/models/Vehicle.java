package com.github.yasserwa.models;

import java.util.Comparator;

/**
 * An abstract class representing a Vehicle
 */
public abstract class Vehicle   {

	 public static Comparator<Vehicle> StuidComparator = new Comparator<Vehicle>() {

			public int compare(Vehicle s1, Vehicle s2) {

		    	   String ModelId1 = s1.getModelId().toUpperCase();
		    	   String ModelId2 = s2.getModelId().toUpperCase();

		    	   //ascending order
		    	   return ModelId1.compareTo(ModelId2);

		    	   //descending order
		    	   //return StudentName2.compareTo(StudentName1);
		        }

			
			};
	private static String MANUFACTURER;

    public String modelId;
    public int year;
    public String engine;

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
    

