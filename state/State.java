package state;

public interface State {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
