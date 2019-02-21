package abstract_factory;

import abstract_factory.themes.Theme;
import abstract_factory.themes.ThemeFactory;

public class Main {
    public static void main(String[] args) {
        Theme theme = ThemeFactory.getTheme(true);

        theme.createButton().renderButton();
        theme.createInputField().renderInputField();
    }
}
