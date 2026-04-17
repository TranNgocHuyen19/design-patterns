package iuh.fit.se.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{
    private String message;
    private boolean changed;
    private Object MUTEX;

    private List<Observer> observers;

    public MyTopic(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        if(o == null)
            throw new RuntimeException("Observer is null");
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        if(!changed){
            return;
        }

        for (Observer o : observers) {
            o.update();
        }
        changed = false;
    }

    @Override
    public Object getUpdate(Observer o) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
