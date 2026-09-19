package Observer.subscribers;

import java.io.File;

public class LogOpenSubscriber implements EventSubscriber{

    @Override
    public void update(String eventType, String file) {
        System.out.println("Save to log. Someone has performed " + eventType + " operation with the following file: " + file);
    }
}
