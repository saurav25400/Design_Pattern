package Structural_Design_Pattern.Proxy_Dsign_Pattern;

public class RemoteProxy implements ICar{

    Scorpio scorpio=new Scorpio();
    @Override
    public void start() {
        scorpio.start();

    }

    @Override
    public void stop() {

        scorpio.stop();

    }

    @Override
    public void left() {
        scorpio.left();

    }

    @Override
    public void right() {
        scorpio.right();


    }
}
