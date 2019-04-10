package state.inclass_example;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();

        State loading = new LoadingState();
        loading.request(device);
        device.printState();

        State playing = new PlayingState();
        playing.request(device);
        device.printState();

        State stopping = new StoppingState();
        stopping.request(device);
        device.printState();
    }
}
