package template;

public abstract class PageTemplate {
    final void servePage() {
        getHeader();
        getContent();
        getFooter();
    }

    private void getHeader() {
        System.out.println("Header");
    }

    abstract void getContent();

    private void getFooter() {
        System.out.println("Footer");
    }
}
