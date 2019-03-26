package strategy;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem( new Item("Cat", 10) );
        cart.addItem( new Item("Dog", 20) );
        cart.addItem( new Item("Expensive Cat", 50) );

        cart.pay( new CreditCardStrategy("Simon", "1234"));
        cart.pay( new PayPalStrategy("email@email.com", "password") );
    }
}
