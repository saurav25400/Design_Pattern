package Behavioural_Design_Pattern.Mediator_Design_pattern;

import java.util.ArrayList;
import java.util.List;

public class ATCTower implements ATCMediator{
    private static List<Flight>flightList=new ArrayList<>();
    @Override
    public void sendMessage(String message, Flight sender) {
        for(Flight flights: flightList){
            if(flights!=sender){

            }
        }


    }

    @Override
    public void registerFlight(Flight flight) {
        flightList.add(flight);

    }
}
