package org.alphaspring.etherstore;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Email")
@Primary
public class EmailNotificationService implements NotificationService{

    @Value("${mail.port}")
    private String port;

    @Value("${mail.host}")
    private String host;

    @Override
    public void send(String message, String recipientEmail){

        System.out.println("Recipient: "+recipientEmail);

        System.out.println("Sending Email : "+message);
        System.out.println("Host: "+host);
        System.out.println("Port: "+ port);
    }
}
