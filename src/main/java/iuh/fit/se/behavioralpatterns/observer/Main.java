package iuh.fit.se.behavioralpatterns.observer;

public class Main {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer obs1 = new MyTopicSubscriber("Observer 1");
        Observer obs2 = new MyTopicSubscriber("Observer 2");
        Observer obs3 = new MyTopicSubscriber("Observer 3");

        topic.register(obs1);
        topic.register(obs2);
        topic.register(obs3);

        obs1.setSubject(topic);
        obs2.setSubject(topic);
        obs3.setSubject(topic);

        topic.postMessage("New Design Pattern video uploaded!");
    }
}
