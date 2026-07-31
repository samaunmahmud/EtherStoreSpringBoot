package org.alphaspring.etherstore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("Stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int stripetimeout;

    @Value("${stripe.supported-currencies}")

    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount){

        System.out.println("API URL :"+apiUrl);
        System.out.println("Status: "+enabled);
        System.out.println("Time Out: "+stripetimeout);
        System.out.println("List of services"+ supportedCurrencies);

        System.out.println("Amount: "+ amount);
    }
}
