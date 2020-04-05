package com.github.matchane;

import com.github.matchane.models.bikes.Kawasaki;
import com.github.matchane.models.cars.Aprilia;
import com.github.matchane.models.cars.Chevrolet;
import com.github.matchane.models.cars.Mercedes;
import com.github.matchane.models.cars.Volkswagen;
import com.github.matchane.models.initializers.BikesInitializer;
import com.github.matchane.models.initializers.CarsInitializer;

public class Main {

    public static void main(String[] args) {

        // CARS =======================
        System.out.println("** CARS ======================= ");
        Mercedes[] MrdCars = CarsInitializer.initMrdCars();

        for (int i = 0; i < MrdCars.length; i++) {
            System.out.println(MrdCars[i]);
        }
        Chevrolet[] ChevroletCars = CarsInitializer.initChevroletCars();

        for (int i = 0; i < ChevroletCars.length; i++) {
            System.out.println(ChevroletCars[i]);
        }
        Volkswagen[] VolkCars = CarsInitializer.initVolkCars();

        for (int i = 0; i < VolkCars.length; i++) {
            System.out.println(VolkCars[i]);
        }
        Aprilia[] ApriliaMoto = CarsInitializer.initApriliaMoto();

        for (int i = 0; i < ApriliaMoto.length; i++) {
            System.out.println(ApriliaMoto[i]);
        }

        // BIKES ========================
        System.out.println("** BIKES ======================= ");

        Kawasaki[] kawasakiBikes = BikesInitializer.initKawasakiBikes();

        for (int i = 0; i < kawasakiBikes.length; i++) {
            System.out.println(kawasakiBikes[i]);
        }
    }
}