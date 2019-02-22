package abstract_factory.themes.dark;

import abstract_factory.themes.Button;
import abstract_factory.themes.InputField;
import abstract_factory.themes.Theme;

public class DarkTheme implements Theme {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public InputField createInputField() {
        return new DarkInputField();
    }
}
