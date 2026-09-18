package TemplateMethod;

public class Twitter extends Network {
    private String username;
    private String password;

    public Twitter(String username,String password){
        this.username=username;
        this.password=password;
    }

    @Override
    protected boolean logIn(String userName, String password) {
        System.out.println("Twitter login");
        return true;
    }

    @Override
    protected void sendDate(String message) {
        System.out.println("Twitter sends data");
    }

    @Override
    protected void logOut() {
        System.out.println("Twitter logout");
    }
}
