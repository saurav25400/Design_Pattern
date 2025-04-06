package Structural_Design_Pattern.Bridge;

public class BridgepatternClient {
    public static void main(String[] args) {
        Vehicle vehicle1=new Bike(new Produce(), new Assembler());
        vehicle1.manufacturing();

        // 2nd object
        Vehicle vehicle2=new Car(new Produce(), new Assembler());
        vehicle1.manufacturing();
    }
}
