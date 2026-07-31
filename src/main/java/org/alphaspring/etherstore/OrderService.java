package org.alphaspring.etherstore;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

//    public OrderService(){
//
//    }
//
//    public OrderService(PaymentService paymentService, int x){}



    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("OrderService created");

    }

    @PostConstruct
    public void init(){
        System.out.println("OrderService PostConstruct");

    }

    public void placeOrder(){

        paymentService.processPayment(100);

    }
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

}
