package Structural_Design_Pattern.Flyweight;

public  class FontClient {
    public static void main(String[] args) {
        Font f1=FontFactory.getFont("Times New Roman");
        Font f2=FontFactory.getFont("Ariel");
        Font f3=FontFactory.getFont("Ariel");

        f1.applyFont("saurav",1,2);
        f2.applyFont("sachin",2,3);
        f3.applyFont("vishnuuu",44,50);
    }
}
