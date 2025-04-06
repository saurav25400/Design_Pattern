package Behavioural_Design_Pattern.Mediator_Design_pattern;
// client or driver program
public class Client {
    public static void main(String[] args) {
        ATCMediator atcMediator=new ATCTower();
        Flight flight1=new Flight(atcMediator,"Flight A");
        Flight flight2=new Flight(atcMediator,"Flight B");
        Flight flight3=new Flight(atcMediator,"Flight C");

        flight1.sendMessage("give permission for landing");
        flight2.sendMessage("now reaching at a height of 1000 metre");
    }





}
