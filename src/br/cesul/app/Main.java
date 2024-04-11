package br.cesul.app;

import br.cesul.store.Product;
import br.cesul.store.Sale;
import br.cesul.store.SaleItem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product productA = new Product("Teste A", 100);
        Product productB = new Product("Teste B", 20);
        Product productC = new Product("Teste C", 35);

        SaleItem itemA = new SaleItem(productA, 3);
        SaleItem itemB = new SaleItem(productB, 2);
        SaleItem itemC = new SaleItem(productC, 5);

        ArrayList<SaleItem> items = new ArrayList<>();
        items.add(itemA);
        items.add(itemB);
        items.add(itemC);

        Sale sale = new Sale(items, 15);

        System.out.println("O valor final da venda é R$ " + sale.getFinalPrice());
    }
}
