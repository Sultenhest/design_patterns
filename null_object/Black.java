package null_object;

public class Black implements Color {
    @Override
    public void getHex() {
        System.out.println("000000");
    }

    @Override
    public void getRGB() {
        System.out.println("0, 0, 0");
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
