package Behavioural_Design_Pattern.ChainResponsibility;

public class Level1SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler=nextHandler;

    }
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.BASIC){
            System.out.println("supportHandler1 will handle the request");
        }
        else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }


    }


}
