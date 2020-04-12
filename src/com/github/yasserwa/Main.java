package com.github.yasserwa;

import com.github.yasserwa.initializers.BikesInitializer;
import com.github.yasserwa.initializers.CarsInitializer;
import com.github.yasserwa.models.Vehicle;
import com.github.yasserwa.models.bikes.Kawasaki;
import com.github.yasserwa.models.bikes.Suzuki;
import com.github.yasserwa.models.cars.Aprilia;
import com.github.yasserwa.models.cars.Chevrolet;
import com.github.yasserwa.models.cars.Mercedes;
import com.github.yasserwa.models.cars.Volkswagen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Mercedes[] mrdCars = CarsInitializer.initMrdCars();
        Chevrolet[] chevroletCars = CarsInitializer.initChevroletCars();
        Volkswagen[] vwCars = CarsInitializer.initVolkCars();
        Aprilia[] apriliaBikes = CarsInitializer.initApriliaMoto();
        Kawasaki[] kawasakiBikes = BikesInitializer.initKawsakiBikes();
        Suzuki[] suzukiBikes = BikesInitializer.initSuzuki();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.addAll(Arrays.asList(mrdCars));
        vehicles.addAll(Arrays.asList(chevroletCars));
        vehicles.addAll(Arrays.asList(apriliaBikes));
        vehicles.addAll(Arrays.asList(kawasakiBikes));
        vehicles.addAll(Arrays.asList(suzukiBikes));

        // CARS =======================
        System.out.println("** CARS ======================= ");

        for (int i = 0; i < mrdCars.length; i++) {
            System.out.println(mrdCars[i]);
        }

        for (int i = 0; i < chevroletCars.length; i++) {
            System.out.println(chevroletCars[i]);
        }

        for (int i = 0; i < vwCars.length; i++) {
            System.out.println(vwCars[i]);
        }

        for (int i = 0; i < apriliaBikes.length; i++) {
            System.out.println(apriliaBikes[i]);
        }

        // BIKES ========================
        System.out.println("** BIKES ======================= ");

        for (int i = 0; i < kawasakiBikes.length; i++) {
            System.out.println(kawasakiBikes[i]);
        }
        for (int i = 0; i < suzukiBikes.length; i++) {
            System.out.println(suzukiBikes[i]);
        }

        // SHOW ALL VEHICLES SORTED BY YEAR ========================
        System.out.println("** VEHICLES SORTED BY YEAR ======================= ");
        Vehicle temp;
        for (int i = 0; i < vehicles.size(); i++) {
            for (int j = i + 1; j < vehicles.size(); j++) {
                if (vehicles.get(i).getYear() > vehicles.get(j).getYear()) {
                    temp = vehicles.get(i);
                    vehicles.set(i, vehicles.get(j));
                    vehicles.set(j, temp);
                }
            }
        }

        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i));

            System.out.println("** VEHICLES SORTED BY YEAR ======================= ");
        /* Vehicle temp;
        for (int i = 0; i < vehicles.size(); i++)
        {
            for (int j = i + 1; j < vehicles.size(); j++) {
                if (vehicles.get(i).getYear() > vehicles.get(j).getYear())
                    {
                    temp = vehicles.get(i);
                    vehicles.set(i, vehicles.get(j));
                    vehicles.set(j, temp);
                }
            }
        }

        for (int i = 0; i < vehicles.size(); i++) {
    		System.out.println(vehicles.get(i));
           
        }*/


            /* Sorted List*/
            System.out.println("Student Name Sorting:");
            Collections.sort(vehicles, Vehicle.StuidComparator);

            for (Vehicle vml : vehicles) {
                System.out.println(vml);
            }
        }

    }
}
 








    
