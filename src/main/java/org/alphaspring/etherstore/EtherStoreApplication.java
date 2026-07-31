package org.alphaspring.etherstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class EtherStoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(EtherStoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);

//        var orderService = new OrderService(new PayPalPaymentService());

//        var orderService = new OrderService();
//        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();
    }

}
