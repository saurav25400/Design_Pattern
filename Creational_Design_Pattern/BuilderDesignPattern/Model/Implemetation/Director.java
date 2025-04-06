package Creational_Design_Pattern.BuilderDesignPattern.Model.Implemetation;

import Creational_Design_Pattern.BuilderDesignPattern.Model.ICarBuilder;

public class Director {

    public ICarBuilder builder;

    public Director(ICarBuilder builder){
        this.builder=builder;
    }

    public void construct(){
        builder.buildEngine();
        builder.buildBodyShell();
        builder.buildTyre();
        builder.buildHorn();
    }













}
