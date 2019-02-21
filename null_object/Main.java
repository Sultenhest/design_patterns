package null_object;

public class Main {
    public static void main(String[] args) {
        Color color = getAColor("Black");
        //Color color = getAColor("notacolor");
        color.getHex();
        color.getRGB();
    }

    private static Color getAColor(String name) {
        Color color;
        switch (name.toLowerCase()) {
            case "black" :
                color = new Black();
                break;
            case "white" :
                color = new White();
                break;
            default:
                color = new NullColor();
        }
        return color;
    }
}
