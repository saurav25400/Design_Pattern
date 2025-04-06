package Creational_Design_Pattern.interfaces;

public class ScorpioFactory implements IVehicle{

    @Override
    public IEngine createEngine() {
        System.out.println("Scorpio ka engine bana rha hoon");
        return new ScorpioEngine();
    }

}
