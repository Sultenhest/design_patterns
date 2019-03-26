package observer;

public class SubscriberTypeB implements Observer {
    private String name;

    public SubscriberTypeB(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
