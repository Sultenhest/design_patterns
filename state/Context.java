package state;

public interface Context {
    void setState(State state);
    void previousState();
    void nextState();
}
