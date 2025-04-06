package Behavioural_Design_Pattern.Observer_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        Stock stock=new Stock(23.90f);

        Observer inverstor=new Investor("saurav");
        stock.addObserver(inverstor);

        Observer investor2=new Investor("sachin2");
        stock.addObserver(investor2);

        stock.notifyAllObserver();

    }
}
