package Creational_Design_Pattern.interfaces;

import Creational_Design_Pattern.interfaces.ABstractLayer.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IVehicle scorpioFaactory=new ScorpioFactory();
        IVehicle defenderFactory=new DefenderGFactory();

        // old ways
        Car car1=new Car(scorpioFaactory);
        Car car2=new Car(defenderFactory);

        ArrayList<Car> list=new ArrayList<>();
        list.add(car1);
        list.add(car2);
        for(Car car: list){
            car.driveCar();
        }
    }
}
