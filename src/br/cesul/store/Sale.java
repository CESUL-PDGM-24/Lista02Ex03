package br.cesul.store;

import java.util.ArrayList;

public class Sale {

    private ArrayList<SaleItem> items;
    private double discount;

    public Sale(ArrayList<SaleItem> items, double discount) {
        this.items = items;
        this.discount = discount;
    }

    public Sale(ArrayList<SaleItem> items) {
        this(items, 0);
    }

    public double getFinalPrice() {
        double totalAmount = 0;

        for (SaleItem item : items) {
            totalAmount += item.getTotal();
        }

        return totalAmount * (1 - (discount / 100));
    }
}
