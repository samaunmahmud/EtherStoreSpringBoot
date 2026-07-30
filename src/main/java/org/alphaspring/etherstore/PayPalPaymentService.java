package org.alphaspring.etherstore;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("PayPal");
        System.out.println("Amount: "+amount);

    }


}
