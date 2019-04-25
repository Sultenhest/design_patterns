package command;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        MovableUnit unit = new MovableUnit();

        unit.printStatus();

        controller.move(new XMoveCommand(), unit); // x:1, y:0
        unit.printStatus();

        controller.move(new XMoveCommand(), unit); // x:2, y:0
        controller.move(new XMoveCommand(), unit); // x:3, y:0

        controller.move(new YMoveCommand(), unit); // x:3, y:1
        unit.printStatus();

        controller.undoLastMove(); // x:3, y:0
        unit.printStatus();

        controller.undoLastMove(); // x:2, y:0
        unit.printStatus();

        controller.redoLastMove(); // x:3, y:0
        unit.printStatus();

        controller.redoLastMove(); // x:3, y:1
        unit.printStatus();
    }
}
