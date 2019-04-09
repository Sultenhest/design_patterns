package template;

public class Main {
    public static void main(String[] args) {
        PageA a = new PageA();
        PageB b = new PageB();

        a.servePage();

        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

        b.servePage();
    }
}
