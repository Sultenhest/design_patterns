//Eager Loading with Static Initialization blocks
package singleton;

public class SingletonStaticBlock {
    public static final SingletonStaticBlock C_INSTANCE;

    //run before constructor. If more than 1 = executed by order
    static {
        try {
            C_INSTANCE = new SingletonStaticBlock();
        } catch(Exception e) {
            throw new ExceptionInInitializerError("Error!");
        }
    }

    private SingletonStaticBlock() {}
}
