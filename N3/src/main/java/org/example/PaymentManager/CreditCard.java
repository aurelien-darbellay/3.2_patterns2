package org.example.PaymentManager;

public class CreditCard implements PaymentMethod {
    @Override
    public boolean controlPayment() {
        boolean authorized = Math.random()>=0.5;
        String toPrint = authorized ? "Payment authorized by Credit Card": "Payment refused by Credit Card";
        System.out.println(toPrint);
        return authorized;
    }
}
