package adapter;

public class PayPalAdapter implements PaymentAdapter {
    private PayPal paypal;

    public PayPalAdapter() {
        this.paypal = new PayPal(12345);
    }

    @Override
    public void pay(int amount) {
        paypal.payWithPayPal(amount);
    }
}
