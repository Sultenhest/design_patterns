package adapter;

public class Main {
    public static void main(String[] args) {
        //withoutAdapter("PayPal", 44);
        withAdapter("Stripe", 22);
    }

    private static void withoutAdapter(String paymentType, int amount) {
        switch (paymentType) {
            case "PayPal" :
                PayPal payPal = new PayPal(390534345);
                payPal.payWithPayPal(amount);
                break;
            case "Stripe" :
                Stripe stripe = new Stripe(435345345);
                stripe.stripeTransfer(amount);
                break;
            default :
                System.out.println("nop");
        }
    }

    private static void withAdapter(String paymentType, int amount) {
        PaymentAdapter adapter = null;
        switch (paymentType) {
            case "PayPal" :
                adapter = new PayPalAdapter(new PayPal(1234));
                break;
            case "Stripe" :
                adapter = new StripeAdapter(new Stripe(324234));
                break;
            default :
                System.out.println(paymentType + " doesn't exist");
        }

        adapter.pay(amount);
    }
}
