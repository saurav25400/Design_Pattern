package Structural_Design_Pattern.Composite;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TaskList implements Task{
    private List<Task>tasksList;
    private String title;

    public TaskList(String title){
        this.title=title;
        this.tasksList=new ArrayList<>();
    }
    @Override
    public void setTitle(String title) {
        this.title=title;

    }

    @Override
    public void display() {
        System.out.println("displaying composite tasks");
        for(Task task:tasksList){
            System.out.println(task);
        }

    }

    @Override
    public String getTitle() {
        return title;
    }
    public void addTask(String title){
        tasksList.add(new SimpleTask());
        tasksList.add(new TaskList(title));
    }

    public void deleteTask(){
        tasksList.removeLast();
    }


}
