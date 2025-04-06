package Creational_Design_Pattern.prototypeDesignPattern;

public class Scorpio implements IScorpioProtoType {

    private ScorpioEngine engine=new ScorpioEngine();
    @Override
    public void setEngine(ScorpioEngine scorpioEngine) {
        this.engine=scorpioEngine;

    }

    @Override
    public void start() {
        System.out.println("This will start now");
    }
    @Override
    public IScorpioProtoType clone() {
        return new Scorpio();
    }
}
