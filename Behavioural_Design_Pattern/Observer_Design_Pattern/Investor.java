package Behavioural_Design_Pattern.Observer_Design_Pattern;


// concrete implementation of Observer
public class Investor implements Observer{
    private String name;
    public Investor(String name){
        this.name=name;
    }
    @Override
    public void update(float price) {
        System.out.println(name+" ,"+"stock price has been updated to "+price);
    }
}
