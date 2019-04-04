package constant_interface;

public interface Interface1 {
    public static final int NUMBER = 1;

    static void staticMethod() {
        System.out.println("Static Interface 1");
    }

    default void foo(){
        System.out.println("foo() Interface 1");
    }
}
