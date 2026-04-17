package iuh.fit.se.behavioralpatterns.observer;

public class MyTopicSubscriber implements Observer{

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Object msg = topic.getUpdate(this);
        if(msg == null) {
            System.out.println(name + " :: No New message");
        } else {
            System.out.println(name + " :: Consuming message :: " + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
