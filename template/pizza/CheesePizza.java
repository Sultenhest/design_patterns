package template.pizza;

public class CheesePizza extends Pizza {
    @Override
    void getPizzaName() {
        System.out.println("Making Cheese Pizza");
    }

    @Override
    void addToppings() {
        System.out.println("no toppings on this one");
    }

    @Override
    void addCheese() {
        System.out.println("adding lots of cheese");
    }
}
