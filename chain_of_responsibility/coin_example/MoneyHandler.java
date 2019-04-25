package chain_of_responsibility.coin_example;

public abstract class MoneyHandler {
    private MoneyHandler next;

    public MoneyHandler(MoneyHandler next) {
        this.next = next;
    }

    public void handleRequest(Deposit deposit) {
        if (next != null) {
            next.handleRequest(deposit);
        } else {
            deposit.printBills();
        }
    }
}
