package decorator.test;

public class OneType implements Coffee {
    public Coffee coffee;

    public OneType(Coffee coffee) {
        this.coffee = coffee;
    }

    public String toString() {
        return "one type";
    }
}
