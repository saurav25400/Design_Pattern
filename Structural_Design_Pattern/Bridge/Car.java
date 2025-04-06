package Structural_Design_Pattern.Bridge;

public class Car extends Vehicle{
    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacturing() {
        System.out.println("manufactring from car class");
        workshop1.work();
        workshop2.work();

    }
}
