package decorator;

public class AdminUser extends UserDecorator {
    public AdminUser(User specialUser) {
        super(specialUser);
    }

    public String login() {
        return isAdmin() + " " + specialUser.logout();
    }

    public String logout() {
        return isAdmin() + " " + specialUser.logout();
    }

    public String isAdmin() {
        return "Special Admin";
    }
}
