package chain_of_responsibility;

public class PostHandler {
    private RequestHandler chain;

    public PostHandler() {
        chain = new GetRequest( new PostRequest( new PutRequest( new PatchRequest( new DeleteRequest(null) ) ) ) );
    }

    public void makeRequest(Post post) {
        chain.handleRequest(post);
    }
}
