package TemplateMethod;

public class Facebook extends Network {

    private String username;
    private String password;

    public Facebook(String username,String password){
        this.username=username;
        this.password=password;
    }
    @Override
    protected boolean logIn(String userName, String password) {
        System.out.println("Facebook Checking");
        return true;
    }

    @Override
    protected void sendDate(String message) {
        System.out.println("Facebook sending");
    }

    @Override
    protected void logOut() {
        System.out.println("Facebook logout");
    }
}
