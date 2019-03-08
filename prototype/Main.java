package prototype;

public class Main {
    public static void main(String[] args) {
        testMyClass();
    }

    public static void testMyClass() {
        MyClass one = new MyClass( 1234, "et" );
        MyClass two = (MyClass) one.clone();

        System.out.println( "Equals: " + one.equals( two ) );
        System.out.println( "One: " + one.data + " : " + one.hashCode() );
        System.out.println( "Two: " + two.data + " : " + two.hashCode() );

    }

    public static void testInputField() {
        InputField originalInputField = new InputField();
        InputField clonedInputField   = (InputField) originalInputField.copy();

        System.out.println("First: " + originalInputField.hashCode());
        System.out.println("Clone: " + clonedInputField.hashCode());

        System.out.println( originalInputField.equals( clonedInputField ) );
    }
}
