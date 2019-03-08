package execute_around_method;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static MyLock myLock = new MyLock();

    public static void main(String[] args) {
        lambdaTest();
    }

    public static void lambdaTest() {
        myLock.aLock( new ReentrantLock(),
            () -> {
                System.out.println( "i'm locked" );
            }
        );
    }

    public static void anonymousInterface() {
        myLock.aLock(
            new ReentrantLock(),
            new MyCallback() {
                public void runFunctionality() {
                    System.out.println("Hello from inside this monstrosity");
                }
            }
        );
    }

    public static void noLamba() {
        TestAClass a = new TestAClass();

        myLock.aLock( new ReentrantLock(), a );
    }
}
