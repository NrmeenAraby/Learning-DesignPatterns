package Singleton.ThreadSafeNoLazyInitialization;

import Singleton.Connection;

//The JVM guarantees static initialization thread-safe initialization.
//static + final >> guarantees that there is only one instance.
public class Database {
    private final static Database INSTANCE=new Database(); //jvm initialization
    private Connection conn;
    private Database(){
        conn=new Connection();
    }

    public Connection getConn() {
        return conn;
    }

    public static Database getINSTANCE() {
        return INSTANCE;
    }
}
