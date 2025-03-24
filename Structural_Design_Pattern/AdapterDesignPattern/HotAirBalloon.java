package Structural_Design_Pattern.AdapterDesignPattern;

public class HotAirBalloon {
    String gasUsed="Hydrogeen";
    void start(String gasUsed){
        System.out.println("gas usd s hydrogen");
    }
    public String gtGasUsd(){
        return this.gasUsed;
    }
}
