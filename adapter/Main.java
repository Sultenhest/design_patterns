package adapter;

public class Main {
    public static void main(String[] args) {
        withoutAdapter("PayPal", 44);
        //withAdapter("Stripe", 22);
    }

    private static void withoutAdapter(String paymentType, int amount) {
        switch (paymentType) {
            case "PayPal" :
                PayPal payPal = new PayPal();
                payPal.payWithPayPal(amount);
                break;
            case "Stripe" :
                Stripe stripe = new Stripe();
                stripe.stripeTransfer(amount);
                break;
            default :
                System.out.println("nop");
        }
    }

    private static void withAdapter(String paymentType, int amount) {
        PaymentAdapter transferPayment = null;
        switch (paymentType) {
            case "PayPal" :
                transferPayment = new PayPalAdapter();
                break;
            case "Stripe" :
                transferPayment = new StripeAdapter();
                break;
            default :
                System.out.println(paymentType + " doesn't exist");
        }

        transferPayment.pay(amount);
    }
}
