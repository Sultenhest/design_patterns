package template;

import template.pizza.*;

public class Main {
    public static void main(String[] args) {
        pizzaExample();
    }

    public static void pizzaExample() {
        Pizza a = new CheesePizza();
        Pizza b = new PepperoniPizza();

        a.prepare();
        System.out.println("");
        b.prepare();
    }

    public static void pageExample() {
        PageTemplate a = new PageA();
        PageTemplate b = new PageB();

        a.servePage();

        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

        b.servePage();
    }
}
