package Structural_Design_Pattern.Decorator_Design_Pattern;

public class BullteProof extends ScorpioDecorator {
    ICar scorpio;
    public BullteProof(ICar myScorpio){
        this.scorpio=myScorpio;
    }

    @Override
    public void start() {
        System.out.println("starting bulletproof");
    }

    @Override
    public void end() {

        System.out.println("ending bulletproof");
    }

    @Override
    public float getWeight() {
        return 300f+ scorpio.getWeight();
    }
}
