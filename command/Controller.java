package command;

import java.util.Deque;
import java.util.LinkedList;

public class Controller {

    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public Controller() {

    }

    public void move(Command command, Receiver receiver) {
        command.execute(receiver);
        undoStack.offerLast(command);
    }

    public void undoLastMove() {
        if (!undoStack.isEmpty()) {
            Command previousMove = undoStack.pollLast();
            redoStack.offerLast(previousMove);
            previousMove.undo();
        }
    }

    public void redoLastMove() {
        if (!redoStack.isEmpty()) {
            Command previousMove = redoStack.pollLast();
            undoStack.offerLast(previousMove);
            previousMove.redo();
        }
    }
}
