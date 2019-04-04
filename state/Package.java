package state;

public class Package implements Context {
    private State state = new OrderedState();

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void previousState() {
        state.prev(this);
    }

    @Override
    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
