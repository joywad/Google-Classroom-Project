package PKG1;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Locale;
import java.io.File;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

// smtp
//test.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 18));
public class mainClass extends Login{
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
    public static void main(String[] args) {
        Login obj = new Login();
        obj.function();

    }

}
