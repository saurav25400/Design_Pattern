package Structural_Design_Pattern.Proxy_Dsign_Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello welcome to Design Pattern");
        RemoteProxy remoteProxy=new RemoteProxy();
        remoteProxy.left();
        remoteProxy.right();
        remoteProxy.start();
        remoteProxy.stop();


    }
}
