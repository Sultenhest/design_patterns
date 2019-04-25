package command;

public abstract class Command {
    abstract void execute(Receiver receiver);
    abstract void undo();
    abstract void redo();

    @Override
    public abstract String toString();
}
