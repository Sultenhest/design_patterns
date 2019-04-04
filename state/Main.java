package state;
public class Main {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();

        System.out.println("- - - - - - - - -");

        pkg.nextState();
        pkg.printStatus();

        System.out.println("- - - - - - - - -");

        pkg.previousState();
        pkg.printStatus();

        System.out.println("- - - - - - - - -");

        pkg.nextState();
        pkg.printStatus();

        System.out.println("- - - - - - - - -");

        pkg.nextState();
        pkg.printStatus();
    }
}
