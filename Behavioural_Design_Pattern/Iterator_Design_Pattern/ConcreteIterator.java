package Behavioural_Design_Pattern.Iterator_Design_Pattern;

import java.util.List;

// this is the implementation of actual iterator with current position
public class ConcreteIterator implements Iterator{
    private  List<String>names;
    public int index=0;

    public ConcreteIterator(List<String>names){
        this.names=names;
    }
    @Override
    public boolean hasNext() {
        return index<names.size();
    }

    @Override
    public String next() {
    return hasNext()==true?names.get(index++):null;
    }
}
