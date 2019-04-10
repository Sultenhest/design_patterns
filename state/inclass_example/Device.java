package state.inclass_example;

public class Device {
    private State state;
    public String songname;

    public Device(String songname) {
        state = new LoadingState();
        this.songname = songname;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        state.request(this);
        printState();
    }

    public void printState() {
        System.out.println( state.toString() + ": " + songname );
    }
}
