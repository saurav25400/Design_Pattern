package BuilderDesignPattern.Model.Implemetation;

import BuilderDesignPattern.Model.ICar;
import BuilderDesignPattern.Model.ICarBuilder;

public class Main {
    public static void main(String[] args) {
        ICarBuilder scorpioBuilder=new ScorpioBuilder();
        ICarBuilder fortunerBuilder=new FortunerBuilder();
        Director director=new Director(scorpioBuilder);
        // provide guidance to the builder;
        director.construct();

        //get the builder

        ICar scorpio=scorpioBuilder.build();
    }
}
