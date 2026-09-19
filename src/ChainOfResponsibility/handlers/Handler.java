package ChainOfResponsibility.handlers;

import ChainOfResponsibility.request.Request;

//route
public abstract class Handler {
    private Handler next;
    public Handler link(Handler next){
        this.next=next;
        return next;
    }
    public abstract boolean check(Request request);

    public boolean passOn(Request request){
        if(next==null)
            return true;
        return next.check(request);
    }

}
