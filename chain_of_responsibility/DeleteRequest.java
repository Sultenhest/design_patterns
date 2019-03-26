package chain_of_responsibility;

import static chain_of_responsibility.RequestType.DELETE;

public class DeleteRequest extends RequestHandler {
    public DeleteRequest(RequestHandler handler) {
        super(handler);
    }
    @Override
    public void handleRequest(Post post) {
        if( post.getRequestType() == DELETE ) {
            System.out.println( "Performing DELETE request for the post" );
        } else {
            super.handleRequest(post);
        }
    }
}
