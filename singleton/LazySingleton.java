package singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if ( instance == null ) {
            instance = new LazySingleton();
        }

        return instance;
    }

    public void doSomething() {
        System.out.println(this.hashCode());
    }
}
