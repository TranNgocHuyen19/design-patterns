package iuh.fit.se.behavioralpatterns.observer;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}
