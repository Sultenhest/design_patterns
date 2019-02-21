package abstract_factory;

public class Main {
    public static void main(String[] args) {
        //if
        useDarkTheme();
        //else
        useLightTheme();
    }

    //DarkTheme (Factory)
    private static void useDarkTheme() {
        Theme darkTheme = new DarkTheme();
        darkTheme.createButton().renderButton();
        darkTheme.createInputField().renderInputField();
    }

    //LightTheme (Factory)
    private static void useLightTheme() {
        Theme lightTheme = new LightTheme();
        lightTheme.createButton().renderButton();
        lightTheme.createInputField().renderInputField();
    }
}
