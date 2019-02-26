package adapter;

public class Stripe {
    private static int StripeApiKey;
    public Stripe (int StripeApiKey) {
        this.StripeApiKey = StripeApiKey;
    }

    public void stripeTransfer( int amount ) {
        System.out.println("Stripe Transfering: " + amount);
    }
}
