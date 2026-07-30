package org.alphaspring.etherstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class EtherStoreApplication {

    public static void main(String[] args) {

//        SpringApplication.run(EtherStoreApplication.class, args);

//        var orderService = new OrderService(new PayPalPaymentService());

        var orderService = new OrderService();
        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();
    }

}
