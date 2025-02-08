package abstract_factory_pattern.interfaces;

public class ScorpioFactory implements IVehicle{

    @Override
    public IEngine createEngine() {
        System.out.println("Scorpio ka engine bana rha hoon");
        return new ScorpioEngine();
    }

}
