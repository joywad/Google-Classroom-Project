package PKG1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    public static Connection getConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseurl="jdbc:mysql://localhost:3306/dbofgoogleclassroom";
            String username = "root";
            String password= "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseurl,username,password);
            System.out.println("Database Connected");
            return conn;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    DBconnection(){
        getConnection();
    }
}
