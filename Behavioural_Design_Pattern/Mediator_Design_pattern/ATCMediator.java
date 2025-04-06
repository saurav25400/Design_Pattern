package Behavioural_Design_Pattern.Mediator_Design_pattern;


// mediator
public interface ATCMediator {
    public void sendMessage(String message, Flight flight);
    public void registerFlight(Flight flight);  // because he needs to talk with multiple flights hers that's ehy need to store all the list of flights(colleagues)
}
