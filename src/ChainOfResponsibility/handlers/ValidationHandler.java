package ChainOfResponsibility.handlers;

import ChainOfResponsibility.request.Priority;
import ChainOfResponsibility.request.Request;

public class ValidationHandler extends Handler{
    @Override
    public boolean check(Request request) {
        if(request.getPriority()!= Priority.VALIDATION && request.getPriority()!=Priority.SUPER) {
            System.out.println("Cant be validated");
            return false;
        }
        System.out.println("Validated");
        return passOn(request);
    }
}
