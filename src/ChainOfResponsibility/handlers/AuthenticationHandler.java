package ChainOfResponsibility.handlers;

import ChainOfResponsibility.request.Priority;
import ChainOfResponsibility.request.Request;

public class AuthenticationHandler extends Handler{
    @Override
    public boolean check(Request request) {
        if(request.getPriority()!= Priority.AUTHENTICATION && request.getPriority()!=Priority.SUPER) {
            System.out.println("Cant be authenticated");
            return false;
        }
        System.out.println("Authenticated");
        return passOn(request);
    }
}
