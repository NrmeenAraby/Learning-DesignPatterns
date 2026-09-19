package ChainOfResponsibility.handlers;

import ChainOfResponsibility.request.Priority;
import ChainOfResponsibility.request.Request;

public class AuthorizationHandler extends Handler{
    @Override
    public boolean check(Request request) {
        if(request.getPriority()!= Priority.AUTHORIZATION && request.getPriority()!=Priority.SUPER){
            System.out.println("Cant be Authorized");
            return false;
        }
        System.out.println("Authorized");
        return passOn(request);
    }
}
