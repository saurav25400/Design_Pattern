package Structural_Design_Pattern.Bridge;

public class Bike extends Vehicle{
    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacturing() {
        System.out.println("Bike doing manufactuuring");
        workshop1.work();
        workshop2.work();

    }
}
