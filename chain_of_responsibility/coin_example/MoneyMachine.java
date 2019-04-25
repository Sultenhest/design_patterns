package chain_of_responsibility.coin_example;

public class MoneyMachine {
    private MoneyHandler chain;

    public MoneyMachine() {
        chain = new FiveHundredHandler( new TwoHundredHandler( new OneHundredHandler( null ) ) );
    }

    public void makeDeposit(Deposit deposit) {
        chain.handleRequest(deposit);
    }
}
