package org.example.PaymentManager;

public class PaymentGateway {
    public enum PaymentMethods{
        PAYPAL,DEBIT,CREDIT
    }
    static public boolean checkPayment(PaymentMethod paymentMethod ){
        return paymentMethod.controlPayment();
    }
}
