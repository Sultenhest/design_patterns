package state.inclass_example;

public class Device {
    private State state;

    public Device() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void printState() {
        System.out.println( state.toString() );
    }
}
