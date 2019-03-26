package chain_of_responsibility;

import static chain_of_responsibility.RequestType.GET;

public class GetRequest extends RequestHandler {
    public GetRequest(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Post post) {
        if( post.getRequestType() == GET ) {
            System.out.println( "Performing GET request for the post" );
        } else {
            super.handleRequest(post);
        }
    }
}
