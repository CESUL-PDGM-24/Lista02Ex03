package br.cesul.store;

public class Sale {

    private Product product;
    private int amount;
    private double discount;

    public Sale(Product product, int amount, double discount) {
        this.product = product;
        this.amount = amount;
        this.discount = discount;
    }

    public Sale(Product product, int amount) {
        this(product, amount, 0);
    }

    public double getFinalPrice() {
        double totalAmount = amount * product.getPrice();
        return totalAmount * (1 - (totalAmount * discount / 100));
    }
}
