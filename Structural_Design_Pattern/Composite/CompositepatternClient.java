package Structural_Design_Pattern.Composite;

public class CompositepatternClient {
    public static void main(String[] args) {
        Task simpleTask=new SimpleTask();
        simpleTask.setTitle("Todo");
        Task simpleTask2=new SimpleTask();
        simpleTask2.setTitle("eating");

         TaskList taskList=new TaskList("project info");
       //  taskList.


    }
}
