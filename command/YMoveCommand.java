package command;

public class YMoveCommand extends Command {
    private Receiver receiver;

    @Override
    public void execute(Receiver receiver) {
        receiver.setYPos( receiver.getYPos() + 1 );
        this.receiver = receiver;
    }

    @Override
    public void undo() {
        if (receiver != null) {
            receiver.setYPos( receiver.getYPos() - 1 );
        }
    }

    @Override
    public void redo() {
        if (receiver != null) {
            receiver.setYPos( receiver.getYPos() + 1 );
        }
    }

    @Override
    public String toString() {
        return "Move Y axis";
    }
}
