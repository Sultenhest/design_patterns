package template;

public class Main {
    public static void main(String[] args) {
        PageTemplate a = new PageA();
        PageTemplate b = new PageB();

        a.servePage();

        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

        b.servePage();
    }
}
