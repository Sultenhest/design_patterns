package null_object;

public class NullColor implements Color {
    @Override
    public void getHex() {
        System.out.println("Null doesnt have a HEX value");
    }

    @Override
    public void getRGB() {
        System.out.println("Null doesnt have a RGB value");
    }
}
