package Behavioural_Design_Pattern.Iterator_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        NameRepository repo=new NameRepository();
        repo.addName("saurav");
        repo.addName("sachin");
        repo.addName("nikki");
        repo.addName("juki");
        repo.addName("chameloneon");

        Iterator iteratorObj=repo.createIterator();
        while(iteratorObj.hasNext()){
            System.out.println(iteratorObj.next());

        }
    }
}
