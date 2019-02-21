package adapter;

public class StripeAdapter implements PaymentAdapter {
    private Stripe stripe;

    public StripeAdapter() {
        this.stripe = new Stripe();
    }

    @Override
    public void pay(int amount) {
        stripe.stripeTransfer(amount);
    }
}
