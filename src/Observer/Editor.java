package Observer;

import Observer.BasePublisher.EventManager;

import java.io.File;

//concrete publisher
public class Editor {
    public EventManager eventManager;
    private String file;
    public Editor (){
        eventManager=new EventManager("open","save"); // events that this publisher will do and needs to notify the listeners on
    }
    public void openFile(){
        this.file="dummy.txt";
        eventManager.notify("open",file);
    }
    public void saveFile(){
        if(this.file!=null) {
            eventManager.notify("save", file);
        }
        else{
            System.out.println("open a file first!");
        }
    }
}