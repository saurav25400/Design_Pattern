package Structural_Design_Pattern.Flyweight;

public class ConcreteFont implements Font{
    // all the shared data will be here
    public String fontName;
    public ConcreteFont(String fontName){
        this.fontName=fontName;
    }
    @Override
    public void applyFont(String text, int x, int y) {
        System.out.println(text+" having font as "+fontName+" with cordinate position as ("+x+","+y+")");

    }






}


