package iterator;

public class Main {
    public static void main(String[] args) {
        Collection userCollection = new UserCollection();
        System.out.println("UserCollection: " + userCollection);

        Iterator userIterator = userCollection.getIterator();
        System.out.println("UserIterator: " + userIterator);

        User first = (User) userIterator.next();
        System.out.println("First user: " + first);

        userIterator.reset();

        while( userIterator.hasNext() ) {
            System.out.println( "User: " + userIterator.next() );
        }
    }
}
