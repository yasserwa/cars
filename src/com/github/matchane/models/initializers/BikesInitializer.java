package com.github.matchane.models.initializers;

import com.github.matchane.models.bikes.Kawasaki;

/**
 * Initializer class for the existing Bikes
 */
public class BikesInitializer {

    public static Kawasaki[] initKawasakiBikes() {
        Kawasaki[] kawasakiBikes = new Kawasaki[2];

        Kawasaki ninjaH2R = new Kawasaki(
                "Ninja H2R ",
                2015,
                "Supercharged (two-speed centrifugal) 998 cc inline-4 DOHC",
                331,
                true);

        Kawasaki ninjaZx = new Kawasaki(
                "Ninja ZX-10RR ",
                2019,
                "798 cc four-stroke I4",
                300,
                true);

        kawasakiBikes[0] = ninjaH2R;
        kawasakiBikes[1] = ninjaZx;

        return kawasakiBikes;
    }

}
