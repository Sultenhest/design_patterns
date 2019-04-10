package state.inclass_example;

public class LoadingState implements State {
    @Override
    public void request(Device device) {
        System.out.println( "Device is in " + this.toString() );
        device.setState(this);
    }

    public String toString() {
        return "Loading State";
    }
}
