package Behavioural_Design_Pattern.Iterator_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class NameRepository implements NameCollection{
    private List<String>names=new ArrayList<>();

    public void addName(String name){
        names.add(name);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(names);
    }

}
