package com.github.matchane.models.initializers;

import com.github.matchane.models.cars.Aprilia;
import com.github.matchane.models.cars.Chevrolet;
import com.github.matchane.models.cars.Mercedes;
import com.github.matchane.models.cars.Volkswagen;

/**
 * Initializer class for the existing cars
 */
public class CarsInitializer {

    public static Chevrolet[] initChevroletCars() {
        Chevrolet[] ChevroletCarsReturn = new Chevrolet[2];


        Chevrolet Volt = new Chevrolet("Volt ", 2011 - 2015
                , "- Hybride �lectricit� + Essence" +
                "" +
                "", "6-speed manual", 4);
        Chevrolet DodgeCharger
                = new Chevrolet("Dodge Charger" +
                "" +
                "", 1969, " 4 cylindres en ligne" +
                "" +
                "", "Manuelle 5 Rapports" +
                "" +
                "", 2);

        ChevroletCarsReturn[0] = Volt;
        ChevroletCarsReturn[1] = DodgeCharger;

        return ChevroletCarsReturn;
    }

    public static Aprilia[] initApriliaMoto() {
        Aprilia[] MotoToReturn = new Aprilia[2];


        Aprilia AF1 = new Aprilia("AF1 ", 1990, "Monocylindre, 2 temps" +
                "", "6-speed manual", 0);
        Aprilia Scooter_50cc
                = new Aprilia("Area 51" +
                "", 2002, "monocylindre 2 temps" +
                "", "Variateur, courroie" +
                "" +
                "", 0);

        MotoToReturn[0] = AF1;
        MotoToReturn[1] = Scooter_50cc;

        return MotoToReturn;
    }

    public static Mercedes[] initMrdCars() {
        Mercedes[] carsToReturn = new Mercedes[2];

        // creating the car objects
        Mercedes m240 = new Mercedes("240", 1988, "L6 (2,5 � 2,7 L) M 123 ; M 110" +
                "", "5-speed manual", 4);
        Mercedes MercedesBenz_220
                = new Mercedes("Mercedes-Benz 220" +
                "", 1951, "6 cylindres en ligne" +
                "", "BVM 4" +
                "", 5);

        carsToReturn[0] = m240;
        carsToReturn[1] = MercedesBenz_220;

        return carsToReturn;
    }

    public static Volkswagen[] initVolkCars() {
        Volkswagen[] carsToReturn = new Volkswagen[2];

        Volkswagen m0 = new Volkswagen("Jetta", 1979, "1.1 50 ch � 1.6 110 ch " +
                "", "5-speed manual_Automatique 3 rapports" +
                "", 4);
        Volkswagen JettaSagitar
                = new Volkswagen("Jetta / Sagitar" +
                "", 2010, "L4 1.2l Turbo 90ch (Essence)" +
                "" +
                "" +
                "", "Manuelle 6 Rapports" +
                "" +
                "", 4);


        carsToReturn[0] = m0;
        carsToReturn[1] = JettaSagitar;

        return carsToReturn;
    }
}
