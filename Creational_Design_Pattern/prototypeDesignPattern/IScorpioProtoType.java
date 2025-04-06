package Creational_Design_Pattern.prototypeDesignPattern;

public interface IScorpioProtoType {

    public IScorpioProtoType clone();

   public  void setEngine(ScorpioEngine scorpioEngine);

    public void start();
}



