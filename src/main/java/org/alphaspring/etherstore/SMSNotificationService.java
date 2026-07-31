package org.alphaspring.etherstore;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("SMS")
@Primary
public class SMSNotificationService implements NotificationService{

    @Override

    public void send(String message){

        System.out.println("Sending SMS: "+message);
    }
}
