package abstract_factory.themes.dark;

import abstract_factory.themes.Button;

class DarkButton implements Button {
    @Override
    public void renderButton() {
        System.out.println("Rendering Dark Button");
    }
}
