package visitor;

public class JumpVisitor implements Visitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Dog jumping");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Cat jumping");
    }
}
