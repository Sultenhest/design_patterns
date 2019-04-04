package constant_interface;

public interface Interface2 {
    default void foo(){
        System.out.println("foo() Interface 2");
    }

    /**
     * How to add a method to the interface without breaking the old code?
     */
    default void addedMethod() {
        System.out.println("Like this");
    }
}
