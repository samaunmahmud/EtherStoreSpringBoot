package org.alphaspring.etherstore;

import org.springframework.stereotype.Service;

@Service
public class NotificatonManager {

    private final NotificationService notificationService;

    public NotificatonManager(NotificationService notificationService){
        this.notificationService = notificationService;

    }


    public void sendNotification(String message){
        notificationService.send(message);
    }
}
