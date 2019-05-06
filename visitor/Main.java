package visitor;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        SoundVisitor sound = new SoundVisitor();

        cat.accept(sound);
        dog.accept(sound);

        System.out.println("- - - - - - -");

        /*
         Create a new command, but instead of adding it to the Visitable(cat or dog)
         we implement Visitor and add the implementations there
         */
        JumpVisitor jump = new JumpVisitor();
        cat.accept(jump);
        dog.accept(jump);
    }
}
