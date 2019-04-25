package decorator;

public class Main {
    public static void main(String[] args) {
        User user = new SimpleUser();
        System.out.println( user.login() );
        System.out.println( user.logout() );

        //Decorate StandardUser
        user = new AdminUser(user);
        System.out.println( user.login() );
        System.out.println( user.logout() );
    }
}
