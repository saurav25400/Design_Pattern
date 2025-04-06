package Creational_Design_Pattern.interfaces.ABstractLayer;

import Creational_Design_Pattern.interfaces.IEngine;
import Creational_Design_Pattern.interfaces.IVehicle;

public class Car {

    public IEngine engine;

    public IVehicle carFactory;

    public Car(IVehicle ivehicle){
        this.carFactory=ivehicle;
    }
    public void driveCar(){
        engine=carFactory.createEngine();
        System.out.println("Gaddi mil gyi hai , challu karo");
    }







}
