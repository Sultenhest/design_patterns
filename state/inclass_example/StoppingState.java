package state.inclass_example;

public class StoppingState implements State {
    @Override
    public void request(Device device) {
        device.setState( new PlayingState() );
    }

    public String toString() {
        return "Stopping";
    }
}
