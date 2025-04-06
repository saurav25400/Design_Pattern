package Structural_Design_Pattern.Composite;

public class SimpleTask implements Task{
    private String title;
    @Override
    public void setTitle(String title) {
        this.title=title;

    }

    @Override
    public void display() {
        System.out.println("displaying simple task");
    }

    @Override
    public String getTitle() {
        return title;
    }
}
