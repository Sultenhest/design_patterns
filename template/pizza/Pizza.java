package template.pizza;

public abstract class Pizza {
    public final void prepare() {
        getPizzaName();
        rollDough();
        addToppings();
        addCheese();
        puttingInOven();
    }

    abstract void getPizzaName();

    private void rollDough() {
        System.out.println("Rolling out the dough");
    }

    abstract void addToppings();

    abstract void addCheese();

    private void puttingInOven() {
        System.out.println("putting the pizza in the oven");
    }
}
