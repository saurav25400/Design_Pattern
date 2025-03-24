package Structural_Design_Pattern.Proxy_Dsign_Pattern;

public class Scorpio implements ICar{
    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void stop() {
        System.out.println("stop thee car");

    }

    @Override
    public void left() {

        System.out.println("Go to left");
    }

    @Override
    public void right() {
        System.out.println("Go to right");

    }
}
