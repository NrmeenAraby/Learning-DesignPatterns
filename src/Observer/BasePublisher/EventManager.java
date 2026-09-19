package Observer.BasePublisher;


import Observer.subscribers.EventSubscriber;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager { //it prevents redundant code when we have many publishers
    HashMap<String, List<EventSubscriber>> subscribers= new HashMap<>();
    public EventManager(String... events){ //operation the publisher needs to notify subscribers when happen
        for(String event:events){
            subscribers.put(event,new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventSubscriber subscriber){
        subscribers.get(eventType).add(subscriber);
    }
    public void unsubscribe(String eventType, EventSubscriber subscriber){
        subscribers.get(eventType).remove(subscriber);
    }
    public void notify(String eventType,String file){
        for(var subscriber:subscribers.get(eventType)){
            subscriber.update(eventType,file);
        }
    }

}
