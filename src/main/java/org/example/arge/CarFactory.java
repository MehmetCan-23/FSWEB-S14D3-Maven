package org.example.arge;

import org.example.company.Car;

public class CarFactory {

    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla","tesla desc",700,2000);
        CarSkeleton hybridCar = new HybridCar("toyota","tyt desc",4000,2000, 4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("honda", "honda desc", 30,4);
        startEngine(electricCar);
        startEngine(hybridCar);
    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}
