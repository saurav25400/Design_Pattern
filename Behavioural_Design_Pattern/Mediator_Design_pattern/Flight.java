package Behavioural_Design_Pattern.Mediator_Design_pattern;

// this is all the colleagues or all the objets class who wants to talk with each other
public class Flight {
    private ATCMediator atcMediator;    // since need to communicate with the mediator
    private String flightName;

    public Flight(ATCMediator atcMediator, String flightName){
        this.atcMediator=atcMediator;
        this.flightName=flightName;
        atcMediator.registerFlight(this); /// refer to the object of current class
    }

    // for sending message to other flights
    public void sendMessage(String message){
        System.out.println(flightName+" sending: "+message);
        atcMediator.sendMessage(message,this);
    }

    public void receiveMessage(String message){
        System.out.println(flightName+" is receving the message as: "+message);

    }

}
