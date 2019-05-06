package bridge;

public class LightTheme implements Theme {
    private String color;

    public LightTheme() {
        color = "Light Theme";
    }

    @Override
    public String toString() {
        return color;
    }
}
