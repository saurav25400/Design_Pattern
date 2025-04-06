package Behavioural_Design_Pattern.ChainResponsibility;

import java.util.PrimitiveIterator;

public class Request {
    private Priority priority;
    public Request(Priority priority){
        this.priority=priority;
    }
    public Priority getPriority(){
        return this.priority;
    }
}
