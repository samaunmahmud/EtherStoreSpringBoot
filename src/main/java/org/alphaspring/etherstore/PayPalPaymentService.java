package org.alphaspring.etherstore;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("PayPal");
        System.out.println("Amount: "+amount);

    }


}
