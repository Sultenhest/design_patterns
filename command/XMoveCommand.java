package command;

public class XMoveCommand extends Command {
    private Receiver receiver;

    @Override
    public void execute(Receiver receiver) {
        receiver.setXPos( receiver.getXPos() + 1 );
        this.receiver = receiver;
    }

    @Override
    public void undo() {
        if (receiver != null) {
            receiver.setXPos( receiver.getXPos() - 1 );
        }
    }

    @Override
    public void redo() {
        if (receiver != null) {
            receiver.setXPos( receiver.getXPos() + 1 );
        }
    }

    @Override
    public String toString() {
        return "Move X axis";
    }
}
