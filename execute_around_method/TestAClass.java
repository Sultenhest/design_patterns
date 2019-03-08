package execute_around_method;

public class TestAClass implements MyCallback {
    @Override
    public void runFunctionality() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep( 200 );
                System.out.println( i );
            }
        }catch ( InterruptedException e ) {
            System.out.println( e );
        }
    }
}
