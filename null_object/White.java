package null_object;

public class White implements Color {
    @Override
    public void getHex() {
        System.out.println("FFFFFF");
    }

    @Override
    public void getRGB() {
        System.out.println("255, 255, 255");
    }
}
