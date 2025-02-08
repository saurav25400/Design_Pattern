package BuilderDesignPattern.Model.Implemetation;

import BuilderDesignPattern.Model.ICar;
import BuilderDesignPattern.Model.ICarBuilder;

public class ScorpioBuilder implements ICarBuilder {
    public ICar scorpio;
    @Override
    public void buildEngine() {
        System.out.println("THis is scorpio engine builder");
    }

    @Override
    public void buildTyre() {
        System.out.println("THis is scorpio tyre builder");

    }

    @Override
    public void buildBodyShell() {
        System.out.println("This is scorpio bodyShell builder");

    }

    @Override
    public void buildHorn() {
        System.out.println("THis is scorpio buildHorn builder");
    }

    public ICar build(){
      return scorpio;
    }
}
