package chain_of_responsibility.coin_example;

public class TwoHundredHandler extends MoneyHandler {
    private int bill = 200;

    public TwoHundredHandler(MoneyHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Deposit deposit) {
        if( deposit.getAmount() >= bill ) {
            deposit.addBill(bill);
            handleRequest(deposit);
        } else {
            super.handleRequest(deposit);
        }
    }
}
