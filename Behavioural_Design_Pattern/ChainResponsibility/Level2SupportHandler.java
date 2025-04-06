package Behavioural_Design_Pattern.ChainResponsibility;

public class Level2SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.INTERMEDIATE){
            System.out.println("level2 handler will handle the request");
        }
        else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }

    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler=nextHandler;

    }
}
