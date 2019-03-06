package iterator;

import java.util.List;

public class UserIterator implements Iterator {
    private List<User> users;
    private int index;

    public UserIterator(List<User> users) {
        this.users = users;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < users.size();
    }

    @Override
    public Object next() {
        if( hasNext() ) {
            return users.get( index++ );
        }

        return null;
    }

    @Override
    public void reset() {
        index = 0;
    }
}
