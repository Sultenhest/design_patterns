package chain_of_responsibility;// import statements

import static chain_of_responsibility.RequestType.PUT;

public class PutRequest extends RequestHandler {
    public PutRequest(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Post post) {
        if( post.getRequestType() == PUT ) {
            System.out.println( "Performing PUT request for the post" );
        } else {
            System.out.println( "Passing on: Not a PUT request" );
            super.handleRequest(post);
        }
    }
}
