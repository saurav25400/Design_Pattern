package Structural_Design_Pattern.Decorator_Design_Pattern;

public class Scorpio implements ICar {
    public static float weight=1500f;
    @Override
    public void start() {
        System.out.println("starting scorpio");
    }

    @Override
    public void end() {

        System.out.println("ending scorpio");
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
