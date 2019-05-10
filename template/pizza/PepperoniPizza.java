package template.pizza;

public class PepperoniPizza extends Pizza {
    @Override
    void getPizzaName() {
        System.out.println("Making Pepperoni Pizza");
    }

    @Override
    void addToppings() {
        System.out.println("adding pepperoni");
    }

    @Override
    void addCheese() {
        System.out.println("adding cheese");
    }
}
