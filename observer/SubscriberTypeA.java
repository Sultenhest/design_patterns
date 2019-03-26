package observer;

public class SubscriberTypeA implements Observer {
    private String name;

    public SubscriberTypeA(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
