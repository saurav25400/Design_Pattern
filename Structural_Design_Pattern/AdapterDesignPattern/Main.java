package Structural_Design_Pattern.AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcom to the main class");
        HotAirBalloon hotAirBalloon=new HotAirBalloon();
        Adapter adapter=new Adapter(hotAirBalloon);
        adapter.start();
    }
}
