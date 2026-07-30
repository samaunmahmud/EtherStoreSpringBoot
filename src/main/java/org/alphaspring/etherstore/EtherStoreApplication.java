package org.alphaspring.etherstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EtherStoreApplication {

    public static void main(String[] args) {

//        SpringApplication.run(EtherStoreApplication.class, args);

        var orderService = new OrderService(new StripePaymentService());
        orderService.placeOrder();
    }

}
