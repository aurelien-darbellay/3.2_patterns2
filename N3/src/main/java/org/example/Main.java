package org.example;

import org.example.PaymentManager.PaymentGateway;

public class Main {
    public static void main(String[] args) {
        ShoesShop newShop = new ShoesShop();
        newShop.sellingItem(PaymentGateway.PaymentMethods.CREDIT,newShop.getItemsInStorage().getFirst());
        newShop.sellingItem(PaymentGateway.PaymentMethods.DEBIT,newShop.getItemsInStorage().getLast());
        newShop.sellingItem(PaymentGateway.PaymentMethods.PAYPAL,newShop.getItemsInStorage().get(2));
    }
}