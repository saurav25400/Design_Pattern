package Creational_Design_Pattern.interfaces;

public class DefenderGFactory implements IVehicle {

    @Override
    public IEngine createEngine() {
        System.out.println("DefenderFactory ka engine bana rha hoon");
        return new DefenderEngine();
    }
}
