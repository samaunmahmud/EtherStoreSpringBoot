package org.alphaspring.etherstore;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("SMS")
public class SMSNotificationService implements NotificationService{





    @Override
    public void send(String message, String recipientEmail) {

    }
}
