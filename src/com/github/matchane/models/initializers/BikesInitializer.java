package com.github.matchane.models.initializers;
import com.github.matchane.models.bikes.Suzuki;

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
    
    public static Suzuki[] initSuzuki() {
    	Suzuki[] SuzukiBikes = new Suzuki[2];
    	Suzuki GSX_R125 = new Suzuki ("GSX_R125",2017,"monocylindre 4T, refroidissement par eau, double ACT, 4 soupaper",290,true);
    			Suzuki DL_1000_VSTROM = new Suzuki("DL_1000_VSTROM",2003 ,"Bicylindre en V à 90°" ,310,true
    					);

    			
    			
    			
    	SuzukiBikes[0]= GSX_R125;
    	SuzukiBikes[1]= DL_1000_VSTROM;
    	return SuzukiBikes;
    	
    
    }

}
