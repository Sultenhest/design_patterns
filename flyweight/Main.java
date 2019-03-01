package flyweight;

public class Main {
    public static void main(String[] args) {
        Shape yellowLargeCircle1 = CircleFactory.getLargeShape("yellow");
        yellowLargeCircle1.getHashcode();

        Shape yellowSmallCircle1 = CircleFactory.getSmallShape("yellow");
        yellowSmallCircle1.getHashcode();

        Shape yellowLargeCircle2 = CircleFactory.getLargeShape("yellow");
        yellowLargeCircle2.getHashcode();
    }
}
