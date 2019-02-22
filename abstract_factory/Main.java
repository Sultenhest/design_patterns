package abstract_factory;

import abstract_factory.themes.Theme;
import abstract_factory.themes.ThemeFactory;

public class Main {
    public static void main(String[] args) {
    }

    private void themeFactoryExample() {
        Theme theme = new ThemeFactory().getTheme(true);

        theme.createButton().renderButton();
        theme.createInputField().renderInputField();
    }
}
