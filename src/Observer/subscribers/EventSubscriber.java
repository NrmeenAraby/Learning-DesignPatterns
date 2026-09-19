package Observer.subscribers;

import java.io.File;

public interface EventSubscriber {
    void update(String eventType, String file);
}
