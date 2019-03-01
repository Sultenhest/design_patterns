package adapter;

public class StripeAdapter implements PaymentAdapter {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(int amount) {
        stripe.stripeTransfer(amount);
    }
}
