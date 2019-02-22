package abstract_factory.themes.dark;

import abstract_factory.themes.InputField;

class DarkInputField implements InputField {
    @Override
    public void renderInputField() {
        System.out.println("Rendering Dark Input Field");
    }
}
