package Behavioural_Design_Pattern.ChainResponsibility;

public interface SupportHandler {
    public void  handleRequest(Request request);
    public void setNextHandler(SupportHandler nextHandler);
}
