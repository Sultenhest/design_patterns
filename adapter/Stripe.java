package adapter;

public class Stripe {
    public Stripe () {}

    public void stripeTransfer( int amount ) {
        System.out.println("Stripe Transfering: " + amount);
    }
}
