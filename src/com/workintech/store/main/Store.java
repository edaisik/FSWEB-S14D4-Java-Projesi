package com.workintech.store.main;

import com.workintech.store.models.Bread;
import com.workintech.store.models.Chocolate;
import com.workintech.store.models.Coke;
import com.workintech.store.models.ProductForSale;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        //ProductForSale product = new ProductForSale();
        //[null, null, null, null, null]
        ProductForSale[] sales = new ProductForSale[5];

        //ProductForSale sale = new Chocolate()
        sales[0] = new Chocolate("Sweet", 20, "Yazılımcı Dostu", "brown", true);
        sales[1] = new Bread("Bakery", 40, "Siyez unundan", "einkorn", "brown");
        sales[2] = new Coke("Drinks", 15, "Soguk İçiniz", true, 1);

        ProductForSale[] salesCopy = Arrays.copyOf(sales, 10);

        listProducts(sales);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}