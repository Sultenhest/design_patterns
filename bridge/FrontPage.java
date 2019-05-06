package bridge;

public class FrontPage implements WebPage {
    private Theme theme;

    public FrontPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Front page in " + theme;
    }
}
