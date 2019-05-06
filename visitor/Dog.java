package visitor;

public class Dog implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); //this = dog
    }
}
