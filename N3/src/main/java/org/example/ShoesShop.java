package org.example;

import org.example.PaymentManager.*;

import java.util.ArrayList;
import java.util.List;

public class ShoesShop {

    private List<String> itemsInStorage = new ArrayList<>();
    {
        itemsInStorage.addAll(List.of("Item 1","Item 2","Item 3","Item 4","Item 5"));
    }

    void sellingItem(PaymentGateway.PaymentMethods paymentMethod, String item){
        PaymentMethod newPayment = switch(paymentMethod){
            case DEBIT -> new DebitCard();
            case CREDIT -> new CreditCard();
            case PAYPAL -> new Paypal();
        };
        boolean authorizationStatus = PaymentGateway.checkPayment(newPayment);
        if (authorizationStatus){
            System.out.println("Sale moves forward - item sold : " + item);
        }else {
            System.out.println("Payment rejected");
        }
    }
    public List<String> getItemsInStorage() {
        return itemsInStorage;
    }

}
