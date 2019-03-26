package chain_of_responsibility;

public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Post post) {
        if (next != null) {
            next.handleRequest(post);
        } else {
            System.out.println( "Cannot process this request" );
        }
    }
}
