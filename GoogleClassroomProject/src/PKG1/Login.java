package PKG1;
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
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import java.util.Locale;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class Login {
    private static void sendEmail(String message, String subject, String to, String from) {

        //Variable for gmail
        String host="smtp.gmail.com";

        //get the system properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES "+properties);

        //setting important information to properties object

        //host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");

        //Step 1: to get the session object..
        Session session=Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("classroomcoree@gmail.com", "xnoirngnyglytvoe");
            }



        });

        session.setDebug(true);

        //Step 2 : compose the message [text,multi media]
        MimeMessage m = new MimeMessage(session);

        try {

            //from email
            m.setFrom(from);

            //adding recipient to message
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            //adding subject to message
            m.setSubject(subject);


            //adding text to message
            m.setText(message);

            //send

            //Step 3 : send the message using Transport class
            Transport.send(m);

            System.out.println("Sent success...................");


        }catch (Exception e) {
            e.printStackTrace();
        }


    }
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
    static int increment = 2;
    public void function()
    {
        JFrame core = new JFrame();
        core.setBounds(200,20,400,700);
        core.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        core.setLayout(null);
        core.setUndecorated(true);
        core.getContentPane().setBackground(Color.white);
        JLabel background1 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\startup.jpg"));
        background1.setBounds(0,0,400,700);
        core.add(background1);

        core.setVisible(true);
        try{
            Thread.sleep(4000);
        }
        catch (Exception c){

        }
        core.setVisible(false);
        background1.setVisible(false);
        JLabel background2 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\loading.gif"));
        background2.setVisible(true);
        background2.setBounds(0,0,400,680);
        core.add(background2);
        core.setVisible(true);

        try{
            Thread.sleep(3200);
        }
        catch (Exception c){

        }
        core.setVisible(false);
        background2.setVisible(false);
        JLabel background3 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\getstarted.jpg"));
        background3.setVisible(true);
        background3.setBounds(0,0,400,680);

        JButton getStarted = new JButton("");
        getStarted.setFocusPainted(false);
        getStarted.setBounds(135,430,130,35);
        getStarted.setBackground( new Color( 0, 0, 0, 200 ) );
        getStarted.setOpaque(false);
        getStarted.setBorder(null);
        getStarted.setContentAreaFilled(false);
        getStarted.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
        getStarted.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background3.add(getStarted);
        core.add(background3);
        core.setVisible(true);
        getStarted.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                background3.setVisible(false);
                JLabel background4 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\Creation.jpg"));
                background4.setVisible(true);
                background4.setBounds(0,0,400,680);
                core.add(background4);
                background4.setVisible(true);
                final JTextField text1 = new JTextField("Email or Phone");
                text1.setBounds(27,212,347,57);
                //text1.setBackground( new Color( 0, 0, 0, 200 ) );
                text1.setBackground( new Color( 255,255,255 ) );
                text1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
                text1.setFocusable(false);
                text1.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        text1.setText("");
                        text1.setFocusable(true);
                    }});
                text1.setBorder(null);

                JLabel invalid_email = new JLabel("Please enter valid Email");
                invalid_email.setBounds(136,266,250,50);
                invalid_email.setBackground( new Color( 0, 0, 0, 200 ) );
                invalid_email.setForeground(Color.red);
                invalid_email.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
                invalid_email.setVisible(false);
                background4.add(invalid_email);

                JButton next = new JButton("");
                next.setFocusPainted(false);
                next.setBounds(289,622,88,35);
                next.setBackground( new Color( 0, 0, 0, 200 ) );
                next.setOpaque(false);
                next.setBorder(null);
                next.setContentAreaFilled(false);
                next.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                next.setCursor(new Cursor(Cursor.HAND_CURSOR));




                next.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(text1.getText().contains("@gmail.com") == true)
                        {
                            background4.setVisible(false);
                            JLabel backgroundd = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\enterPass.jpg"));
                            backgroundd.setVisible(true);
                            backgroundd.setBounds(0,0,400,680);
                            core.add(backgroundd);
                            backgroundd.setVisible(true);

                            JTextField passW = new JTextField("Password");
                            passW.setBounds(30,229,340,57);
                            passW.setBackground( new Color( 0, 0, 0, 200 ) );
                            passW.setBackground( new Color( 255,255,255 ) );
                            passW.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
                            passW.setBorder(null);
                            backgroundd.add(passW);
                            passW.setFocusable(false);

                            JPasswordField passW2 = new JPasswordField("");
                            passW2.setBounds(30,229,340,57);
                            passW2.setBackground( new Color( 0, 0, 0, 200 ) );
                            passW2.setBackground( new Color( 255,255,255 ) );
                            passW2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
                            passW2.setBorder(null);

                            JButton checkBox = new JButton("");
                            checkBox.setFocusPainted(false);
                            checkBox.setBounds(31,305,18,18);
                            checkBox.setBackground(Color.white);
                            checkBox.setBorder(null);
                            checkBox.setOpaque(false);
                            checkBox.setContentAreaFilled(false);
                            checkBox.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                            checkBox.setCursor(new Cursor(Cursor.HAND_CURSOR));

                            checkBox.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {

                                    if(increment % 2 == 0){
                                        checkBox.setOpaque(true);
                                        checkBox.setContentAreaFilled(true);
                                        passW.setVisible(false);
                                        passW2.setText(passW.getText());
                                        passW2.setVisible(true);
                                        backgroundd.add(passW2);
                                    }
                                    else{
                                        checkBox.setOpaque(false);
                                        checkBox.setContentAreaFilled(false);
                                        passW.setVisible(true);
                                        passW.setText(passW2.getText());
                                        passW2.setVisible(false);
                                        backgroundd.add(passW);
                                    }
                                    increment++;

                                }
                            });
                            backgroundd.add(checkBox);
                            passW.addMouseListener(new MouseAdapter(){
                                @Override
                                public void mouseClicked(MouseEvent e){
                                    if(increment == 2)
                                    {
                                        passW.setText("");
                                        passW.setFocusable(true);
                                    }
                                }});
                            JButton next3 = new JButton("");
                            next3.setFocusPainted(false);
                            next3.setBounds(290,622,80,35);
                            next3.setBackground( new Color( 0, 0, 0, 200 ) );
                            next3.setOpaque(false);
                            next3.setBorder(null);
                            next3.setContentAreaFilled(false);
                            next3.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                            next3.setCursor(new Cursor(Cursor.HAND_CURSOR));
                            backgroundd.add(next3);


                            next3.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {

                                    try{
                                        Connection conn = getConnection();
                                        PreparedStatement select = conn.prepareStatement("SELECT * FROM userinfo");
                                        ResultSet result = select.executeQuery();
                                        String s;
                                        s = text1.getText();
                                        while(result.next()) {


                                            if(result.getString("Email").equals(s))
                                            {
                                                if(result.getString("Password").equals(passW.getText()))
                                                    if(result.getString("Password").equals(passW.getText()))
                                                    {
                                                        AfterLogin objj = new AfterLogin();
                                                        objj.classes(text1.getText());
                                                        break;
                                                    }
                                            }

                                        }

                                    } catch (SQLException ee) {
                                        throw new RuntimeException(ee);
                                    }

                                }
                            });
                        }
                        else
                        {
                            invalid_email.setVisible(true);
                        }
                    }
                });

                background4.add(next);


                JButton CreateAcc = new JButton("");
                CreateAcc.setFocusPainted(false);
                CreateAcc.setBounds(20,622,127,35);
                CreateAcc.setBackground( new Color( 0, 0, 0, 200 ) );
                CreateAcc.setOpaque(false);
                CreateAcc.setBorder(null);
                CreateAcc.setContentAreaFilled(false);
                CreateAcc.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                CreateAcc.setCursor(new Cursor(Cursor.HAND_CURSOR));
                background4.add(CreateAcc);

                background4.add(text1);
                background4.setVisible(true);
                core.setVisible(true);
                CreateAcc.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        background4.setVisible(false);
                        JLabel background5 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\fnamlname.jpg"));
                        background5.setVisible(true);
                        background5.setBounds(0,0,400,680);
                        core.add(background5);
                        background5.setVisible(true);
                        JTextField fName = new JTextField("First Name");
                        fName.setBounds(30,212,340,57);
                        fName.setBackground( new Color( 0, 0, 0, 200 ) );
                        fName.setBackground( new Color( 255,255,255 ) );
                        fName.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
                        fName.setBorder(null);
                        background5.add(fName);
                        background5.setVisible(true);
                        fName.setFocusable(false);

                        fName.addMouseListener(new MouseAdapter(){
                            @Override
                            public void mouseClicked(MouseEvent e){
                                fName.setText("");
                                fName.setFocusable(true);
                            }});


                        JTextField lName = new JTextField("Last Name");
                        lName.setBounds(30,302,340,57);
                        lName.setBackground( new Color( 0, 0, 0, 200 ) );
                        lName.setBackground( new Color( 255,255,255 ) );
                        lName.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
                        lName.setBorder(null);
                        background5.add(lName);
                        background5.setVisible(true);
                        lName.setFocusable(false);
                        lName.addMouseListener(new MouseAdapter(){
                            @Override
                            public void mouseClicked(MouseEvent e){
                                lName.setText("");
                                lName.setFocusable(true);
                            }});
                        core.setVisible(true);

                        JButton next2 = new JButton("");
                        next2.setFocusPainted(false);
                        next2.setBounds(290,622,80,35);
                        next2.setBackground( new Color( 0, 0, 0, 200 ) );
                        next2.setOpaque(false);
                        next2.setBorder(null);
                        next2.setContentAreaFilled(false);
                        next2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                        next2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        background5.add(next2);

                        next2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JLabel background6 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\password.jpg"));
                                background6.setVisible(true);
                                background6.setBounds(0,0,400,680);
                                core.add(background6);
                                background5.setVisible(false);

                                JTextField passW = new JTextField("Password");
                                passW.setBounds(30,239,340,57);
                                passW.setBackground( new Color( 0, 0, 0, 200 ) );
                                passW.setBackground( new Color( 255,255,255 ) );
                                passW.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
                                passW.setBorder(null);
                                background6.add(passW);
                                passW.setFocusable(false);

                                JPasswordField passW2 = new JPasswordField("");
                                passW2.setBounds(30,239,340,57);
                                passW2.setBackground( new Color( 0, 0, 0, 200 ) );
                                passW2.setBackground( new Color( 255,255,255 ) );
                                passW2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
                                passW2.setBorder(null);

                                JButton checkBox = new JButton("");
                                checkBox.setFocusPainted(false);
                                checkBox.setBounds(31,312,18,18);
                                checkBox.setBackground(Color.white);
                                checkBox.setBorder(null);
                                checkBox.setOpaque(false);
                                checkBox.setContentAreaFilled(false);
                                checkBox.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                                checkBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                checkBox.addActionListener(new ActionListener()
                                {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        if(increment % 2 == 0){
                                            checkBox.setOpaque(true);
                                            checkBox.setContentAreaFilled(true);
                                            passW.setVisible(false);
                                            passW2.setText(passW.getText());
                                            passW2.setVisible(true);
                                            background6.add(passW2);
                                        }
                                        else{
                                            checkBox.setOpaque(false);
                                            checkBox.setContentAreaFilled(false);
                                            passW.setVisible(true);
                                            passW.setText(passW2.getText());
                                            passW2.setVisible(false);
                                            background6.add(passW);
                                        }
                                        increment++;

                                    }
                                });
                                background6.add(checkBox);

                                passW.addMouseListener(new MouseAdapter(){
                                    @Override
                                    public void mouseClicked(MouseEvent e){
                                        if(increment == 2)
                                        {
                                            passW.setText("");
                                            passW.setFocusable(true);
                                        }
                                    }});

                                JButton next3 = new JButton("");
                                next3.setFocusPainted(false);
                                next3.setBounds(290,622,80,35);
                                next3.setBackground( new Color( 0, 0, 0, 200 ) );
                                next3.setOpaque(false);
                                next3.setBorder(null);
                                next3.setContentAreaFilled(false);
                                next3.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                                next3.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                background6.add(next3);
                                next3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
//-------------------------------------------------------------------------------------------------------

                                        JLabel background7 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\username.jpg"));
                                        background7.setVisible(true);
                                        background7.setBounds(0,0,400,680);
                                        core.add(background7);
                                        background6.setVisible(false);

                                        JTextField userN = new JTextField("Username");
                                        userN.setBounds(30,239,225,57);
                                        userN.setBackground( new Color( 0, 0, 0, 200 ) );
                                        userN.setBackground( new Color( 255,255,255 ) );
                                        userN.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
                                        userN.setBorder(null);
                                        background7.add(userN);
                                        userN.setFocusable(false);


                                        userN.addMouseListener(new MouseAdapter(){
                                            @Override
                                            public void mouseClicked(MouseEvent e){
                                                userN.setText("");
                                                userN.setFocusable(true);
                                            }});
                                        JButton next4 = new JButton("");
                                        next4.setFocusPainted(false);
                                        next4.setBounds(290,622,80,35);
                                        next4.setBackground( new Color( 0, 0, 0, 200 ) );
                                        next4.setOpaque(false);
                                        next4.setBorder(null);
                                        next4.setContentAreaFilled(false);
                                        next4.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                                        next4.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                        background7.add(next4);
                                        next4.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                //--------------------------------------------

                                                JLabel background8 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\review.jpg"));
                                                background7.setVisible(false);
                                                background8.setBounds(0,0,400,680);
                                                JLabel reviewName = new JLabel("");
                                                reviewName.setText(fName.getText()+" "+lName.getText());

                                                reviewName.setBounds(72,210,150,50);
                                                reviewName.setBackground( new Color( 0, 0, 0, 200 ) );
                                                reviewName.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
                                                background8.add(reviewName);

                                                JLabel reviewEmail = new JLabel("");
                                                reviewEmail.setText(userN.getText()+"@gmail.com");
                                                String reviewEmailDB = userN.getText()+"@gmail.com";
                                                reviewEmail.setBounds(72,228,200,50);
                                                reviewEmail.setBackground( new Color( 0, 0, 0, 200 ) );
                                                reviewEmail.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
                                                background8.add(reviewEmail);

                                                JButton FirstWord = new JButton();
                                                FirstWord.setBounds(32,235,20,20);
                                                FirstWord.setBackground( new Color( 236,64,122) );
                                                FirstWord.setForeground(Color.white);
                                                FirstWord.setFocusPainted(false);
                                                FirstWord.setBorder(null);
                                                String s1 = reviewName.getText();
                                                FirstWord.setText(String.valueOf(s1.charAt(0)).toUpperCase(Locale.ROOT));
                                                FirstWord.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 16));
                                                background8.add(FirstWord);


                                                core.add(background8);
                                                background8.setVisible(false);

                                                JButton next5 = new JButton("");
                                                next5.setFocusPainted(false);
                                                next5.setBounds(290,622,80,35);
                                                next5.setBackground( new Color( 0, 0, 0, 200 ) );
                                                next5.setOpaque(false);
                                                next5.setBorder(null);
                                                next5.setContentAreaFilled(false);
                                                next5.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                                                next5.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                                background8.add(next5);

                                                JLabel please_wait = new JLabel("Please wait....");
                                                please_wait.setBounds(110,266,250,50);
                                                please_wait.setBackground( new Color( 0, 0, 0, 200 ) );
                                                please_wait.setForeground(Color.BLUE);
                                                please_wait.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
                                                please_wait.setVisible(false);
                                                background8.add(please_wait);

                                                next5.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        background8.setVisible(false);
                                                        //background4.setVisible(true);
                                                        background3.setVisible(false);
                                                        JLabel confirmationBack = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\codeVerify.jpg"));
                                                        confirmationBack.setVisible(true);
                                                        confirmationBack.setBounds(0,0,400,680);
                                                        core.add(confirmationBack);
                                                        confirmationBack.setVisible(true);


                                                        String randomNumber="";
                                                        for(int i = 0 ; i < 6 ; i++)
                                                        {
                                                            Random s = new Random();
                                                            int _ran = s.nextInt(9);
                                                            randomNumber = randomNumber+_ran;
                                                        }
                                                        System.out.println(randomNumber);


                                                        final JTextField confoText = new JTextField("Confirmation Code");
                                                        confoText.setBounds(34,123,335,45);
                                                        confoText.setBackground( new Color( 0, 0, 0, 200 ) );
                                                        confoText.setBackground( new Color( 255,255,255 ) );
                                                        confoText.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
                                                        confoText.setFocusable(false);
                                                        confoText.addMouseListener(new MouseAdapter(){
                                                            @Override
                                                            public void mouseClicked(MouseEvent e){
                                                                confoText.setText("");
                                                                confoText.setFocusable(true);
                                                            }});
                                                        confoText.setBorder(null);

                                                        JButton confoNext = new JButton("");
                                                        confoNext.setFocusPainted(false);
                                                        confoNext.setBounds(35,186,325,35);
                                                        confoNext.setBackground( new Color( 0, 0, 0, 200 ) );
                                                        confoNext.setOpaque(false);
                                                        confoNext.setBorder(null);
                                                        confoNext.setContentAreaFilled(false);
                                                        confoNext.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                                                        confoNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                                        confirmationBack.add(confoNext);

                                                        JLabel lb = new JLabel("");
                                                        lb.setText(userN.getText()+"@gmail.com");
                                                        lb.setVisible(true);
                                                        lb.setBounds(40,70,400,50);
                                                        lb.setFont(new Font("Arial", Font.BOLD, 14));
                                                        confirmationBack.add(lb);
                                                        lb.setVisible(true);

                                                        String finalRandomNumber = randomNumber;
                                                        System.out.println(finalRandomNumber);

                                                        String message = finalRandomNumber;
                                                        String subject = "Verification Code";
                                                        String to = userN.getText()+"@gmail.com";
                                                        System.out.println(to);
                                                        String from = "classroomcoree@gmail.com";



                                                        JLabel invalid_code = new JLabel("Please enter valid Code");
                                                        invalid_code.setBounds(110,266,250,50);
                                                        invalid_code.setBackground( new Color( 0, 0, 0, 200 ) );
                                                        invalid_code.setForeground(Color.red);
                                                        invalid_code.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
                                                        invalid_code.setVisible(false);
                                                        confirmationBack.add(invalid_code);

                                                        sendEmail(message,subject,to,from);


                                                        confoNext.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                if(finalRandomNumber.equals(confoText.getText()))
                                                                {
                                                                    confirmationBack.setVisible(false);
                                                                    try{
                                                                        Connection conn = getConnection();
                                                                        String st = "INSERT INTO userinfo VALUES ('"+fName.getText()+"', '"+lName.getText()+"', '"+reviewEmailDB+"', '"+passW.getText()+"','null','null','null','null','null','null')";
                                                                        PreparedStatement insert = conn.prepareStatement(st);
                                                                        insert.executeUpdate();

                                                                    }
                                                                    catch (SQLException ee) {
                                                                        throw new RuntimeException(ee);
                                                                    }
                                                                    background4.setVisible(true);
                                                                }
                                                                else{
                                                                    invalid_code.setVisible(true);
                                                                }
                                                            }
                                                        });

                                                        confirmationBack.add(confoNext);
                                                        confirmationBack.add(confoText);
                                                        confirmationBack.setVisible(true);
                                                        core.setVisible(true);
                                                    }
                                                });
                                                background8.setVisible(true);
                                                core.setVisible(true);

                                                //--------------------------------------------
                                            }

                                        });
                                        background7.setVisible(true);
                                        core.setVisible(true);
//-------------------------------------------------------------------------------------------------------
                                    }
                                });

                                background6.setVisible(true);
                                core.setVisible(true);
                            }
                        });
                        core.setVisible(true);

                    }

                });

            }
        });


    }

}
