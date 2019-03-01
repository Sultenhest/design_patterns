package adapter;

public class PayPalAdapter implements PaymentAdapter {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(int amount) {
        paypal.payWithPayPal(amount);
    }
}
