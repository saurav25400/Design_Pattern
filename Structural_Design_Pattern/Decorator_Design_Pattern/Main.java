package Structural_Design_Pattern.Decorator_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        //decorator pattern
        ICar scorpio=new Scorpio();
        ICar bulletProofScorpio=new BullteProof(scorpio);
       float weight= bulletProofScorpio.getWeight();
        System.out.println(weight);

    }
}
