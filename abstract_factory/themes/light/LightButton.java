package abstract_factory.themes.light;

import abstract_factory.themes.Button;

class LightButton extends Button {
    @Override
    public void renderButton() {
        System.out.println("Rendering Light Button");
    }
}
