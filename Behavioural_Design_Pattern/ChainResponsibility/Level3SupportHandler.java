package Behavioural_Design_Pattern.ChainResponsibility;

public class Level3SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.ADVANCED){
            System.out.println("supportHandler3 will handle the whole request");
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
