package abstract_factory;

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
