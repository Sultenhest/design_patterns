package adapter;

public class StripeAdapter implements PaymentAdapter {
    private Stripe stripe;

    public StripeAdapter() {
        this.stripe = new Stripe(234234);
    }

    @Override
    public void pay(int amount) {
        stripe.stripeTransfer(amount);
    }
}
