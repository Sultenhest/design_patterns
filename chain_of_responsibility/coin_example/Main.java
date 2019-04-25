package chain_of_responsibility.coin_example;

public class Main {
    public static void main(String[] args) {
        MoneyMachine moneyMachine = new MoneyMachine();

        Deposit deposit = new Deposit(1883);

        moneyMachine.makeDeposit( deposit );
    }
}
