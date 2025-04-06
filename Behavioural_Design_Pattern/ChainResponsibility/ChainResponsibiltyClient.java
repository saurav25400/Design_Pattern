package Behavioural_Design_Pattern.ChainResponsibility;

public class ChainResponsibiltyClient {
    public static void main(String[] args) {
        SupportHandler level1Handler=new Level1SupportHandler();
        SupportHandler level2Handler=new Level2SupportHandler();
        SupportHandler level3handler=new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3handler);

        /// creating Request Object

        Request request1=new Request(Priority.BASIC);
        Request request2=new Request(Priority.INTERMEDIATE);
        Request request3=new Request(Priority.ADVANCED);

        level1Handler.handleRequest(request3);
        level2Handler.handleRequest(request1);
    }
}
