package singleton;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        Logger loggerOne = Logger.getInstance();
        Logger loggerTwo = Logger.getInstance();

        loggerOne.addCommand("1.1");
        loggerTwo.addCommand("2.1");
        loggerOne.addCommand("1.2");
        loggerOne.addCommand("1.3");

        loggerOne.print();

        loggerTwo.undoCommand();

        loggerTwo.logToFile();
    }

    public static void reflectionBreakSingleton() {
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = null;
        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for( Constructor constructor : constructors ) {
                constructor.setAccessible(true);
                es2 = (EagerSingleton) constructor.newInstance();
                break;
            }
            System.out.println( es1.hashCode() + " = " + es2.hashCode());
            //IllegalAccessException | IllegalArgumentException | InstantiationError | SecurityException
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println( ( es1 == es2 ) ? "Singleton\n" : "Not a Singleton\n" );
    }

    public static void testSingletonStaticBlock() {
        SingletonStaticBlock ssb1 = SingletonStaticBlock.C_INSTANCE;
        SingletonStaticBlock ssb2 = SingletonStaticBlock.C_INSTANCE;

        System.out.println((ssb1 == ssb2) ? "Singleton\n" : "Not a Singleton\n");
    }

    public static void testLazySingleton() {
        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();

        ls1.doSomething();
        ls2.doSomething();
    }
}
