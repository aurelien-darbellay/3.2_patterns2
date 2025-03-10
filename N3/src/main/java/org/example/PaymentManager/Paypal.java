package org.example.PaymentManager;

public class Paypal implements PaymentMethod {
    @Override
    public boolean controlPayment() {
        boolean authorized = Math.random()>=0.5;
        String toPrint = authorized ? "Payment authorized by Paypal": "Payment refused by Paypal";
        System.out.println(toPrint);
        return authorized;
    }
}
