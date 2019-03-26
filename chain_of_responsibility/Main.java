package chain_of_responsibility;

import static chain_of_responsibility.RequestType.*;

public class Main {
    public static void main(String args[]) {
        PostHandler postHandler = new PostHandler();

        Post post = new Post(1, "content", POST);

        postHandler.makeRequest( post );
    }
}
