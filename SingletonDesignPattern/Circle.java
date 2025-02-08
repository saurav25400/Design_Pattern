package SingletonDesignPattern;

public class Circle {
    private Circle(){
        System.out.println("Circle constructor is being called");
    }
    private static class Singleton{
        private static final Circle instance=new Circle();
    }

    public static Circle getInstance(){
        return Singleton.instance;
    }



    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            Circle.getInstance();
        },"t1");
        Thread t2=new Thread(()->{
            Circle.getInstance();
        },"t2");

        t1.start();
        t2.start();




    }










}
