package Structural_Design_Pattern.AdapterDesignPattern;

import Structural_Design_Pattern.Decorator_Design_Pattern.ICar;

public class Adapter implements ICar {
    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon){
        this.hotAirBalloon=hotAirBalloon;
    }

    @Override
    public void start() {
         String gasUsed= hotAirBalloon.gasUsed;
         hotAirBalloon.start(gasUsed);


    }

    @Override
    public void end() {

    }

    @Override
    public float getWeight() {
        return 0;
    }
}
