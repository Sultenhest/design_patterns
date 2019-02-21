package abstract_factory.themes.light;

import abstract_factory.themes.Button;
import abstract_factory.themes.InputField;
import abstract_factory.themes.Theme;

public class LightTheme extends Theme {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public InputField createInputField() {
        return new LightInputField();
    }
}
