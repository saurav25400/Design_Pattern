package abstract_factory_pattern.interfaces.ABstractLayer;

import abstract_factory_pattern.interfaces.IEngine;
import abstract_factory_pattern.interfaces.IVehicle;

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
