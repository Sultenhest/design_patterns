package chain_of_responsibility.coin_example;

import java.util.ArrayList;

public class Deposit {
    private int initAmount;
    private int amount;
    private ArrayList<Integer> bills = new ArrayList<>();

    public Deposit(int amount) {
        initAmount = amount;
        setAmount(amount);
    }

    public int getAmount() {
        return amount;
    }

    private void setAmount(int amount) {
        this.amount = amount;
    }

    private int getInitAmount() {
        return initAmount;
    }

    public void addBill(int bill) {
        setAmount(amount -= bill);
        bills.add(bill);
    }

    public void printBills() {
        System.out.println("Initial amount:   " + getInitAmount());
        System.out.println("Money returned:   " + bills);
        System.out.println("Remaining amount: " + getAmount());
    }
}
