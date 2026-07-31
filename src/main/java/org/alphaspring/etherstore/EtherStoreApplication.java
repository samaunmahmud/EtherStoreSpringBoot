package org.alphaspring.etherstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import java.util.Scanner;

@SpringBootApplication
public class EtherStoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(EtherStoreApplication.class, args);

        context.getBean(HeavyResource.class);
//        var orderService = context.getBean(OrderService.class);

//        var orderService = new OrderService(new PayPalPaymentService());

//        var orderService = new OrderService();
//        orderService.setPaymentService(new PayPalPaymentService());
//        orderService.placeOrder();


//        Scanner input = new Scanner(System.in);
//        String message = "";
//        System.out.println("Enter the message: ");
//        message = input.nextLine();
//        var notificationManager = context.getBean(NotificatonManager.class);
//
//
//
//        notificationManager.sendNotification(message);

        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder(); // we called it here
    }

}
