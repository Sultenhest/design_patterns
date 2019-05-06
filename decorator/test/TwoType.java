package decorator.test;

public class TwoType implements Coffee {
    public Coffee coffee;

    public TwoType(Coffee coffee) {
        this.coffee = coffee;
    }

    public String toString() {
        return "two type";
    }
}
