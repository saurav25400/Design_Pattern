package prototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        IScorpioProtoType scorpioN=new Scorpio().clone();
       scorpioN.setEngine(new ScorpioNEngine());

       // getting scorpioClassic
        IScorpioProtoType scorpioClassic=new Scorpio().clone();
        scorpioClassic.setEngine(new ScorpioClassic());


    }
}
