package visitor;

public class SoundVisitor implements Visitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Bark");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Miaw");
    }
}
