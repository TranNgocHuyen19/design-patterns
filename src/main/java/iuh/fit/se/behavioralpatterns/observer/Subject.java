package iuh.fit.se.behavioralpatterns.observer;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
    Object getUpdate(Observer o);
}
