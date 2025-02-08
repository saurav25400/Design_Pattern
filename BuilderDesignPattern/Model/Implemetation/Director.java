package BuilderDesignPattern.Model.Implemetation;

import BuilderDesignPattern.Model.ICarBuilder;

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
