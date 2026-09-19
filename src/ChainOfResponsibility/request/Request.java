package ChainOfResponsibility.request;

public class Request {
    private String name;
    private Priority priority;

    public Request(String name, Priority priority){
        this.name=name;
        this.priority=priority;
    }

    public String getName() {
        return name;
    }

    public Priority getPriority() {
        return priority;
    }
}
