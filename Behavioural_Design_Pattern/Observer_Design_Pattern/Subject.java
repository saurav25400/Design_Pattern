package Behavioural_Design_Pattern.Observer_Design_Pattern;

// publisher interface
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}
