package decorator;

import decorator.test.Coffee;
import decorator.test.OneType;
import decorator.test.Simple;
import decorator.test.TwoType;

public class Main {
    public static void main(String[] args) {
        testCoffee();
    }

    public static void testCoffee() {
        Coffee coffee = new Simple();
        System.out.println(coffee);

        coffee = new OneType(coffee);
        System.out.println(coffee);

        coffee = new TwoType(coffee);
        System.out.println(coffee);

        coffee = new OneType(coffee);
        System.out.println(coffee);
    }

    public static void testUser() {
        User user = new SimpleUser();
        System.out.println( user.login() );
        System.out.println( user.logout() );

        //Decorate StandardUser
        user = new AdminUser(user);
        System.out.println( user.login() );
        System.out.println( user.logout() );}
}
