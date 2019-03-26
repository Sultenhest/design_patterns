package chain_of_responsibility;

public class Post {
    private int id;
    private String content;

    private RequestType requestType;

    public Post(int id, String content, RequestType requestType) {
        this.id = id;
        this.content = content;
        this.requestType = requestType;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}
