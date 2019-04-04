package constant_interface;

public class DoubleInterface implements Interface1, Interface2 {
    public static void main(String[] args) {
        Interface1.staticMethod();

        DoubleInterface di = new DoubleInterface();
        di.foo();
    }

    public void foo() {
        System.out.println("DoubleInterface");
        Interface1.super.foo();
        Interface2.super.foo();
    }
}
