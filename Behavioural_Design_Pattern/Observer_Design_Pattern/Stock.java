package Behavioural_Design_Pattern.Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{
    private static List<Observer>observerList=new ArrayList<>();
    private float price;     // need to update the stock of price\


    public Stock(float price){
        this.price=price;
        notifyAllObserver();
    }
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
       observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer observer:observerList){
            observer.update(price);
        }

    }
}
