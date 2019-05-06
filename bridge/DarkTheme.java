package bridge;

public class DarkTheme implements Theme {
    private String color;

    public DarkTheme() {
        color = "Dark Theme";
    }

    @Override
    public String toString() {
        return color;
    }
}
