package state.inclass_example;

public class PlayingState implements State {
    @Override
    public void request(Device device) {
        System.out.println( "Device is in " + this.toString() );
        device.setState(this);
    }

    public String toString() {
        return "Playing State";
    }
}
