package visitor;

public class Cat implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); //this = cat
    }
}
