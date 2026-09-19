package Singleton.LazyIntialization;


import Singleton.Connection;

//static + null check >>guarantees that there is only one instance
public class DatabaseLazyInit {
    private static DatabaseLazyInit instance;
    private Connection conn;
    private DatabaseLazyInit(){
        conn=new Connection();
    }

    public Connection getConn() {
        return conn;
    }
    public static DatabaseLazyInit getInstance(){
        if(instance!=null){
            return instance;
        }
        return instance=new DatabaseLazyInit();
    }
}
