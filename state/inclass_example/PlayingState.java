package state.inclass_example;

public class PlayingState implements State {
    @Override
    public void request(Device device) {
        device.setState( new StoppingState() );
    }

    public String toString() {
        return "Playing";
    }
}
