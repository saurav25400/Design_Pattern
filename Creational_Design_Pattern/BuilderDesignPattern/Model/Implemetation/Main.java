package Creational_Design_Pattern.BuilderDesignPattern.Model.Implemetation;

import Creational_Design_Pattern.BuilderDesignPattern.Model.ICar;
import Creational_Design_Pattern.BuilderDesignPattern.Model.ICarBuilder;

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
