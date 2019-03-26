package observer;

import java.util.ArrayList;

public class Broadcaster {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String message;

    public Broadcaster(String message) {
        this.message = message;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public void waiting(int ms) {
        System.out.println("Going to wait for " + ms + " ms");
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done waiting");
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update( message );
        }
    }
}
