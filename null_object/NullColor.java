package null_object;

public class NullColor implements Color {
    public static final NullColor NULL_COLOR_INSTANCE = new NullColor();

    private NullColor() {}

    @Override
    public void getHex() {
        System.out.println("Null doesnt have a HEX value");
    }

    @Override
    public void getRGB() {
        System.out.println("Null doesnt have a RGB value");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
