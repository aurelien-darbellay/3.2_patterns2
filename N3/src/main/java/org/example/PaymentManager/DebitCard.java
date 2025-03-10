package org.example.PaymentManager;

public class DebitCard implements PaymentMethod {
    @Override
    public boolean controlPayment() {
        boolean authorized = Math.random()>=0.5;
        String toPrint = authorized ? "Payment authorized by Debit Card": "Payment refused by Debit Card";
        System.out.println(toPrint);
        return authorized;
    }
}
