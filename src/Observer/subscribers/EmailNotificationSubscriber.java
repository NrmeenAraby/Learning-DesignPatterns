package Observer.subscribers;

import java.io.File;

public class EmailNotificationSubscriber implements EventSubscriber{
    private String email;
    public EmailNotificationSubscriber(String email){
        this.email=email;
    }
    @Override
    public void update(String eventType, String file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file);
    }
}
