package strategy;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int getTotal() {
        int total = 0;

        for(Item item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay( getTotal() );
    }
}
