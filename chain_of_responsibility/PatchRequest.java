package chain_of_responsibility;

import static chain_of_responsibility.RequestType.PATCH;

public class PatchRequest extends RequestHandler {
    public PatchRequest(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Post post) {
        if( post.getRequestType() == PATCH ) {
            System.out.println( "Performing PUT request for the post" );
        } else {
            System.out.println( "Passing on: Not a PATCH request" );
            super.handleRequest(post);
        }
    }
}
