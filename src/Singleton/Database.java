package Singleton;

public class Database {
    private static final Database instance=new Database();
    private final Connection conn;
    private Database(){
        conn=new Connection();
    }
    public static Database getInstance(){
        return instance;
    }
    public Connection getConnection(){
        return conn;
    }
}
