package com.github.matchane.models.bikes;

public class Suzuki extends Bike {
	private static String MANUFACTURER = "Suzuki";
	
	public Suzuki(String modelId, int year, String engine, int topSpeed, boolean racingBike) {
        super(modelId, year, engine, topSpeed, racingBike);
        
	}
	public String toString () { return " "
	+"MANUFACTURER =" +MANUFACTURER+ '\'' +
	"modelId =" + getModelId() + '\'' +
	"year ="+ getYear() + '\'' + "engine =" + '\'' + getEngine() + '\'' +
	"topSpeed = "+ getTopSpeed() + '\'' +
	"racingBike = " + isRacingBike() + '\''  ;         
		
	}
	}
/**	
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
*/
