package abstract_factory;

public class DarkTheme extends Theme {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public InputField createInputField() {
        return new DarkInputField();
    }
}
