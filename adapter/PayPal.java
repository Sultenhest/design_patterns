package adapter;

public class PayPal {
    private static int PayPalApiKey;
    public PayPal(int PayPalApiKey) {
        this.PayPalApiKey = PayPalApiKey;
    }

    public void payWithPayPal( int amount ) {
        System.out.println("PayPal Payment: " + amount);
    }
}
