package org.alphaspring.etherstore;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;

    }

    public void placeOrder(){

        paymentService.processPayment(100);

    }
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

}
