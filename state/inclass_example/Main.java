package state.inclass_example;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Song by somebody");
        device.printState();
        device.changeState();
        device.changeState();
        device.changeState();
    }
}
