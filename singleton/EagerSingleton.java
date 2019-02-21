//Eager Implementation
package singleton;

public class EagerSingleton {
    private static EagerSingleton e_instance = new EagerSingleton();

    /*
     * Eager implementation 2 - no need for getInstance()
     * public static final EagerSingleton E_INSTANCE = new EagerSingleton();
     */

    public static EagerSingleton getInstance() {
        return EagerSingleton.e_instance;
    }

    private EagerSingleton() {

    }
}
