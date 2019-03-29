package chain_of_responsibility;

import static chain_of_responsibility.RequestType.POST;

public class PostRequest extends RequestHandler {
    public PostRequest(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Post post) {
        if( post.getRequestType() == POST ) {
            System.out.println( "Performing POST request for the post" );
        } else {
            System.out.println( "Passing on: Not a POST request" );
            super.handleRequest(post);
        }
    }
}
