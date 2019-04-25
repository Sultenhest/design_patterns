package decorator;

public class SimpleUser implements User {
    @Override
    public String login() {
        return "User logged in";
    }

    @Override
    public String logout() {
        return "User logged out";
    }

    public void addComment() {
        System.out.println("Adding comment");
    }
}
