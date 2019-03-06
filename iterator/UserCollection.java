package iterator;

import java.util.ArrayList;
import java.util.List;

public class UserCollection implements Collection {
    private List<User> users;

    public UserCollection() {
        //Database call?
        users = new ArrayList<>();
        users.add( new User( "Bob", "1234" ) );
        users.add( new User( "Alice", "1234" ) );
        users.add( new User( "Simon", "1234" ) );
    }

    @Override
    public Iterator getIterator() {
        return new UserIterator( users );
    }
}
