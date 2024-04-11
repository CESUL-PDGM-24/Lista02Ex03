package br.cesul.app;

import br.cesul.store.Product;
import br.cesul.store.Sale;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("teste", 100);
        Sale sale = new Sale(product, 3, 15);

        System.out.println("O valor final da venda é R$ " + sale.getFinalPrice());
    }
}
