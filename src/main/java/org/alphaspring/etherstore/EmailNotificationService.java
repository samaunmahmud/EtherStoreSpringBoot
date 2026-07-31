package org.alphaspring.etherstore;


import org.springframework.stereotype.Service;

@Service("Email")
public class EmailNotificationService implements NotificationService{

    @Override
    public void send(String message){
        System.out.println("Sending Email : "+message);
    }
}
