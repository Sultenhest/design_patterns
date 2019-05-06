package bridge;

public class Main {
    public static void main(String[] args) {
        DarkTheme dt = new DarkTheme();
        LightTheme lt = new LightTheme();

        WebPage front = new FrontPage(dt);
        WebPage about = new About(lt);

        System.out.println(front.getContent());
        System.out.println(about.getContent());
    }
}
