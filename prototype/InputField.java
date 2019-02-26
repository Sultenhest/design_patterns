package prototype;

public class InputField implements GUIElement {
    public InputField() {
        System.out.println("Created InputField");
    }

    @Override
    public GUIElement copy() {
        System.out.println("Copying InputField");

        InputField inputField = null;

        try{
            inputField = (InputField) super.clone();
        } catch(CloneNotSupportedException ex) {
            System.out.println(ex);
        }

        return inputField;
    }

    public String toString() {
        return "Inputfield";
    }
}
