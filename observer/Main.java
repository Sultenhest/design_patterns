package observer;

public class Main {
    public static void main(String[] args) {
        Observer observerOne = new SubscriberTypeA("Type A");
        Observer observerTwo = new SubscriberTypeB("Type B");

        Broadcaster broadcaster = new Broadcaster("Initial message");
        broadcaster.addObserver(observerOne);
        broadcaster.addObserver(observerTwo);

        broadcaster.notifyObservers();

        broadcaster.waiting(5000);

        broadcaster.setMessage("A new update");
    }
}
