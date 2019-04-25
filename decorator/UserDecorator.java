package decorator;

public abstract class UserDecorator implements User {
    protected User specialUser;

    public UserDecorator(User specialUser) {
        this.specialUser = specialUser;
    }

    @Override
    public String login() {
        return specialUser.login();
    }

    @Override
    public String logout() {
        return specialUser.logout();
    }

}
