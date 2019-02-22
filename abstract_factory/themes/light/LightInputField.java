package abstract_factory.themes.light;

import abstract_factory.themes.InputField;

class LightInputField implements InputField {
    @Override
    public void renderInputField() {
        System.out.println("Rendering Light Input Field");
    }
}
