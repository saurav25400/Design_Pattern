package BuilderDesignPattern.Model.Implemetation;

import BuilderDesignPattern.Model.ICar;
import BuilderDesignPattern.Model.ICarBuilder;

import java.net.http.WebSocket;

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
