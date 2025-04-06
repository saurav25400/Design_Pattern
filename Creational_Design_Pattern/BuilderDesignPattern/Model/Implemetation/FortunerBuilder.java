package Creational_Design_Pattern.BuilderDesignPattern.Model.Implemetation;

import Creational_Design_Pattern.BuilderDesignPattern.Model.ICar;
import Creational_Design_Pattern.BuilderDesignPattern.Model.ICarBuilder;

public class FortunerBuilder implements ICarBuilder {
    public ICar fortuner;
    @Override
    public void buildEngine() {
        System.out.println("This is for building engine");
    }

    @Override
    public void buildTyre() {
        System.out.println("This is for building Tyre");

    }

    @Override
    public void buildBodyShell() {
        System.out.println("This is for building bodyShell");

    }

    @Override
    public void buildHorn() {
        System.out.println("This is for building horn");

    }
    public ICar build(){
        return fortuner;
    }



}
