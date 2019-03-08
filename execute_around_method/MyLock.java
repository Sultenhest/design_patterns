package execute_around_method;

import java.util.concurrent.locks.Lock;

public class MyLock {
    public void aLock(Lock l, MyCallback myCallback) {
        l.lock();
        System.out.println( "Lock" );
        try {
            myCallback.runFunctionality();
        } finally {
            l.unlock();
            System.out.println( "Unlock" );
        }
    }
}
