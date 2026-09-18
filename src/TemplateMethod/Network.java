package TemplateMethod;

public abstract class Network {
    private String username;
    private String password;
    protected Network(){}

    public final boolean post(String message){
        startPost();
        hook();
        if(logIn(this.username,this.password)){
            sendDate(message);
            logOut();
            return true;
        }
        return false;
    }

    public void startPost(){
        System.out.println("Starting..");
    }
    protected abstract boolean logIn(String userName,String password);
    protected abstract void sendDate(String message);
    protected abstract void logOut();
    public void hook(){};
}
