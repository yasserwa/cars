package com.github.matchane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.matchane.initializers.BikesInitializer;
import com.github.matchane.initializers.CarsInitializer;
import com.github.matchane.models.Vehicle;
import com.github.matchane.models.bikes.Kawasaki;
import com.github.matchane.models.bikes.Suzuki;
import com.github.matchane.models.cars.Aprilia;
import com.github.matchane.models.cars.Chevrolet;
import com.github.matchane.models.cars.Mercedes;
import com.github.matchane.models.cars.Volkswagen;


public class Main {

    public static void main(String[] args) {
    	
        Mercedes[] MrdCars = CarsInitializer.initMrdCars();
        Chevrolet[] ChevroletCars = CarsInitializer.initChevroletCars();
        Volkswagen[] VolkCars = CarsInitializer.initVolkCars();

        List <Vehicle> vehicles = new ArrayList<>();
        vehicles.addAll(Arrays.asList(MrdCars));
        vehicles.addAll(Arrays.asList(ChevroletCars));


        // CARS =======================
        System.out.println("** CARS ======================= ");

        for (int i = 0; i < MrdCars.length; i++) {
            System.out.println(MrdCars[i]);
        }

        for (int i = 0; i < ChevroletCars.length; i++) {
            System.out.println(ChevroletCars[i]);
        }

        for (int i = 0; i < VolkCars.length; i++) {
            System.out.println(VolkCars[i]);
        }
       

        // BIKES ========================
        System.out.println("** BIKES ======================= ");


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

 	   for(Vehicle vml: vehicles){
 			System.out.println(vml);
 	   }
	}
               
        }
 








    
