package Structural_Design_Pattern.Flyweight;

import java.util.HashMap;

public class FontFactory {
    public static HashMap<String,Font>map=new HashMap<>();

    public static Font getFont(String fontName){
        map.putIfAbsent(fontName,new ConcreteFont(fontName));
        return map.get(fontName);
    }
}
