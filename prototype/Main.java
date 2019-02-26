package prototype;

public class Main {
    public static void main(String[] args) {
        InputField originalInputField = new InputField();
        InputField clonedInputField   = (InputField) originalInputField.copy();

        System.out.println("First: " + originalInputField.hashCode());
        System.out.println("Clone: " + clonedInputField.hashCode());
    }
}
