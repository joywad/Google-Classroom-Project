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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static PKG1.mainClass.getConnection;
import static javax.swing.JOptionPane.showMessageDialog;

public class AfterLogin {
    String glob ;
    int checkcheck = 0 ;
    JTextField className = new JTextField("");
    JTextField section = new JTextField("");

    public void allClasses(){

    }
    public void createClassMethod(){

    }
    public void joinClassMethod(){

    }

    public void classes(String st){
        glob = st;
        JFrame core = new JFrame();
        core.setBounds(200,20,400,700);
        core.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        core.setLayout(null);
        core.setUndecorated(true);
        core.getContentPane().setBackground(Color.white);

        JLabel background1 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\CJclass1.jpg"));
        background1.setBounds(0,0,400,700);

        // Class1
        JLabel class1white = new JLabel("");
        class1white.setBounds(8,70,389,179);
        background1.add(class1white);
        class1white.setBackground(Color.white);
        class1white.setOpaque(true);
        class1white.setVisible(true);
        core.add(background1);

        JButton class1Name = new JButton();
        class1Name.setFocusPainted(false);
        class1Name.setHorizontalAlignment(SwingConstants.LEFT);
        class1Name.setBounds(16,90,160,30);
        class1Name.setBackground( new Color( 0, 0, 0, 200 ) );
        class1Name.setOpaque(false);
        class1Name.setBorder(null);
        class1Name.setContentAreaFilled(false);
        class1Name.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 18));
        class1Name.setForeground(Color.white);
        class1Name.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background1.add(class1Name);


        class1Name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame click1 = new JFrame();
                click1.setBounds(200,20,400,700);
                click1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                click1.setLayout(null);
                click1.setUndecorated(true);
                click1.getContentPane().setBackground(Color.white);

                JLabel click1Label = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\click1OS.jpg"));
                click1Label.setBounds(0,0,400,700);

                JButton dot = new JButton("");
                dot.setFocusPainted(false);
                dot.setBounds(370,16,20,35);
                dot.setBackground( new Color( 0, 0, 0, 200 ) );
                dot.setOpaque(false);
                dot.setBorder(null);
                dot.setContentAreaFilled(false);
                dot.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
                dot.setCursor(new Cursor(Cursor.HAND_CURSOR));
                dot.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        click1.setVisible(false);
                        JFrame click2 = new JFrame();
                        click2.setBounds(200,20,400,700);
                        click2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        click2.setLayout(null);
                        click2.setUndecorated(true);
                        click2.getContentPane().setBackground(Color.white);

                        JLabel click2Label = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\click2OS.jpg"));
                        click2Label.setBounds(0,0,400,700);

                        JButton classcodebutton = new JButton("Class Code");
                        classcodebutton.setFocusPainted(false);
                        classcodebutton.setBounds(185,28,270,35);
                        classcodebutton.setBackground( new Color( 0, 0, 0, 200 ) );
                        classcodebutton.setOpaque(false);
                        classcodebutton.setBorder(null);
                        classcodebutton.setHorizontalAlignment(SwingConstants.LEFT);
                        classcodebutton.setContentAreaFilled(false);
                        classcodebutton.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                        classcodebutton.setCursor(new Cursor(Cursor.HAND_CURSOR));

                        classcodebutton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                click2Label.setVisible(false);
                                JLabel classCodeCheck = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\ClassCodeCheck.jpg"));
                                classCodeCheck.setBounds(0,0,400,700);


                                JLabel simText = new JLabel("OPERATING SYSTEM CLASS CODE");
                                simText.setBounds(60,20,300,40);
                                simText.setBackground( new Color( 0, 0, 0, 200 ) );
                                simText.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                                simText.setOpaque(false);
                                simText.setBorder(null);
                                simText.setHorizontalAlignment(SwingConstants.LEFT);
                                classCodeCheck.add(simText);

                                JLabel codeofClass = new JLabel("CLASS CODE : 889926");
                                codeofClass.setBounds(80,200,300,40);
                                codeofClass.setBackground( new Color( 0, 0, 0, 200 ) );
                                codeofClass.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
                                codeofClass.setOpaque(false);
                                codeofClass.setBorder(null);
                                codeofClass.setHorizontalAlignment(SwingConstants.LEFT);
                                classCodeCheck.add(codeofClass);


                                JButton btn2 = new JButton("");
                                btn2.setFocusPainted(false);
                                btn2.setBounds(10,15,30,30);
                                btn2.setBackground( new Color( 0, 0, 0, 200 ) );
                                btn2.setOpaque(false);
                                btn2.setBorder(null);
                                btn2.setHorizontalAlignment(SwingConstants.LEFT);
                                btn2.setContentAreaFilled(false);
                                btn2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                                btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                classCodeCheck.add(btn2);
                                classCodeCheck.setVisible(true);
                                click2.add(classCodeCheck);
                                click2.setVisible(true);
                                btn2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        click1.setVisible(true);
                                    }
                                });
                            }
                        });

                        JButton logoutButton = new JButton("Logout");
                        logoutButton.setFocusPainted(false);
                        logoutButton.setBounds(185,75,270,35);
                        logoutButton.setBackground( new Color( 0, 0, 0, 200 ) );
                        logoutButton.setOpaque(false);
                        logoutButton.setHorizontalAlignment(SwingConstants.LEFT);
                        logoutButton.setBorder(null);
                        logoutButton.setContentAreaFilled(false);
                        logoutButton.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
                        logoutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        click2Label.add(classcodebutton);
                        logoutButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                click1.dispose();
                                click2.dispose();
                                core.dispose();
                            }
                        });
                        click2Label.add(logoutButton);
                        click2.add(click2Label);
                        click2.setVisible(true);

                    }
                });
                click1Label.add(dot);
                click1.add(click1Label);
                click1.setVisible(true);
            }
        });


        JLabel class1Section = new JLabel("");
        class1Section.setBounds(18,120,150,30);
        class1Section.setOpaque(false);
        class1Section.setBorder(null);
        class1Section.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 17));
        class1Section.setForeground(Color.white);
        class1Section.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background1.add(class1Section);

        //Class 2

        JLabel class2white = new JLabel("");
        class2white.setBounds(8,249,390,170);
        background1.add(class2white);
        class2white.setBackground(Color.white);
        class2white.setOpaque(true);
        class2white.setVisible(true);
        core.add(background1);

        JButton class2Name = new JButton("");
        class2Name.setFocusPainted(false);
        class2Name.setBounds(16,260,160,30);
        class2Name.setHorizontalAlignment(SwingConstants.LEFT);
        class2Name.setBackground( new Color( 0, 0, 0, 200 ) );
        class2Name.setOpaque(false);
        class2Name.setBorder(null);
        class2Name.setContentAreaFilled(false);
        class2Name.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 18));
        class2Name.setForeground(Color.white);
        class2Name.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background1.add(class2Name);

        JLabel class2Section = new JLabel("");
        class2Section.setBounds(18,290,150,30);
        class2Section.setOpaque(false);
        class2Section.setBorder(null);
        class2Section.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 17));
        class2Section.setForeground(Color.white);
        class2Section.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background1.add(class2Section);

        // Class3
        JLabel class3white = new JLabel("");
        class3white.setBounds(8,420,389,170);
        background1.add(class3white);
        class3white.setBackground(Color.white);
        class3white.setOpaque(true);
        class3white.setVisible(true);
        core.add(background1);

        JButton class3Name = new JButton("");
        class3Name.setFocusPainted(false);
        class3Name.setBounds(16,430,160,30);
        class3Name.setHorizontalAlignment(SwingConstants.LEFT);
        class3Name.setBackground( new Color( 0, 0, 0, 200 ) );
        class3Name.setOpaque(false);
        class3Name.setBorder(null);
        class3Name.setContentAreaFilled(false);
        class3Name.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 18));
        class3Name.setForeground(Color.white);
        class3Name.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background1.add(class3Name);

        JLabel class3Section = new JLabel("");
        class3Section.setBounds(18,460,150,30);
        class3Section.setOpaque(false);
        class3Section.setBorder(null);
        class3Section.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 17));
        class3Section.setForeground(Color.white);
        class3Section.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background1.add(class3Section);


        try {
            Connection conn = getConnection();
            System.out.println("1");
            PreparedStatement select = conn.prepareStatement("SELECT * FROM userinfo WHERE Email = '"+glob+"'");

            ResultSet result = select.executeQuery();
            System.out.println("2");


            while(result.next()) {

                if (result.getString("Class1").equals("null"))
                {

                }
                else
                {
                    if (result.getString("Class2").equals("null"))
                    {
                        class1Name.setText(result.getString("Class1"));
                        class1Section.setText(result.getString("Section1"));
                        class1white.setVisible(false);
                        core.setVisible(true);
                    }
                    else
                    {
                        if (result.getString("Class3").equals("null"))
                        {
                            class1Name.setText(result.getString("Class1"));
                            class1Section.setText(result.getString("Section1"));
                            class1white.setVisible(false);
                            core.setVisible(true);

                            class2Name.setText(result.getString("Class2"));
                            class2Section.setText(result.getString("Section2"));
                            class2white.setVisible(false);
                            core.setVisible(true);
                        }
                        else
                        {
                            class1Name.setText(result.getString("Class1"));
                            class1Section.setText(result.getString("Section1"));
                            class1white.setVisible(false);
                            core.setVisible(true);

                            class2Name.setText(result.getString("Class2"));
                            class2Section.setText(result.getString("Section2"));
                            class2white.setVisible(false);
                            core.setVisible(true);

                            class3Name.setText(result.getString("Class3"));
                            class3Section.setText(result.getString("Section3"));
                            class3white.setVisible(false);
                            core.setVisible(true);

                        }
                    }
                }

            }

        }

         catch (SQLException e) {
            throw new RuntimeException(e);
        }

        JButton plus = new JButton("");
        plus.setFocusPainted(false);
        plus.setBounds(322,625,43,40);
        plus.setBackground( new Color( 0, 0, 0, 200 ) );
        plus.setOpaque(false);
        plus.setBorder(null);
        plus.setContentAreaFilled(false);
        plus.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
        plus.setCursor(new Cursor(Cursor.HAND_CURSOR));
        background1.add(plus);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                background1.setVisible(false);
                JLabel background23 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\CJclass.jpg"));
                background23.setBounds(0,0,400,700);
                core.add(background23);

                JButton createClass = new JButton("");
                createClass.setFocusPainted(false);
                createClass.setBounds(0,592,200,40);
                createClass.setBackground( new Color( 0, 0, 0, 200 ) );
                createClass.setOpaque(false);
                createClass.setBorder(null);
                createClass.setContentAreaFilled(false);
                createClass.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
                createClass.setCursor(new Cursor(Cursor.HAND_CURSOR));
                background23.add(createClass);

                JButton joinClass = new JButton("");
                joinClass.setFocusPainted(false);
                joinClass.setBounds(0,640,200,40);
                joinClass.setBackground( new Color( 0, 0, 0, 200 ) );
                joinClass.setOpaque(false);
                joinClass.setBorder(null);
                joinClass.setContentAreaFilled(false);
                joinClass.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
                joinClass.setCursor(new Cursor(Cursor.HAND_CURSOR));
                background23.add(joinClass);

                createClass.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        core.setVisible(false);
                        JFrame core2 = new JFrame();
                        core2.setBounds(200,20,400,700);
                        core2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        core2.setLayout(null);
                        core2.setUndecorated(true);
                        core2.getContentPane().setBackground(Color.white);

                        JLabel background13 = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\CreateClass.jpg"));
                        background13.setBounds(0,0,400,700);



                        className.setBounds(33,123,340,26);
                        className.setBackground( new Color( 240,244,245 ) );
                        className.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
                        className.setBorder(null);
                        background13.add(className);


                        section.setBounds(33,203,340,26);
                        section.setBackground( new Color( 240,244,245 ) );
                        section.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
                        section.setBorder(null);
                        background13.add(section);

                        core2.add(background13);

                        JTextField room = new JTextField("");
                        room.setBounds(33,283,340,26);
                        room.setBackground( new Color( 240,244,245 ) );
                        room.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
                        room.setBorder(null);
                        background13.add(room);

                        JTextField subject = new JTextField("");
                        subject.setBounds(33,366,340,26);
                        subject.setBackground( new Color( 240,244,245 ) );
                        subject.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
                        subject.setBorder(null);
                        background13.add(subject);

                        JButton createB = new JButton("");
                        createB.setFocusPainted(false);
                        createB.setBounds(255,18,96,35);
                        createB.setBackground( new Color( 0, 0, 0, 200 ) );
                        createB.setOpaque(false);
                        createB.setBorder(null);
                        createB.setContentAreaFilled(false);
                        createB.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
                        createB.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        core2.add(background13);
                        background13.add(createB);
                        core2.setVisible(true);
                        createB.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //checkcheck = checkcheck + 2;
                                 try{
                                    Connection conn = getConnection();
                                    PreparedStatement select = conn.prepareStatement("SELECT * FROM userinfo WHERE Email = '"+glob+"'");
                                    ResultSet result = select.executeQuery();

                                     while(result.next()) {
                                         if (result.getString("Class1").equals("null")) {
                                             try {
                                                 class1Name.setText(className.getText());
                                                 class1Section.setText(section.getText());
                                                 class1white.setVisible(false);
                                                 core.setVisible(true);

                                                 Connection connn = getConnection();
                                                 String sst = "UPDATE userinfo SET Class1 = '" + class1Name.getText() + "', Section1 = '" + class1Section.getText() + "' WHERE Email = '" + glob + "'";

                                                 PreparedStatement insert = connn.prepareStatement(sst);
                                                 insert.executeUpdate();

                                             } catch (SQLException ee) {
                                                 throw new RuntimeException(ee);
                                             }
                                         } else if (result.getString("Class2").equals("null")){
                                             try {
                                                 Connection connn = getConnection();

                                                 class2Name.setText(className.getText());
                                                 class2Section.setText(section.getText());
                                                 class1white.setVisible(false);
                                                 class2white.setVisible(false);
                                                 background1.setVisible(true);
                                                 core.setVisible(true);

                                                 String sst = "UPDATE userinfo SET Class2 = '" + class2Name.getText() + "', Section2 = '" + class2Section.getText() + "' WHERE Email = '" + glob + "'";
                                                 System.out.println("Hello");
                                                 PreparedStatement insert = connn.prepareStatement(sst);
                                                 insert.executeUpdate();
                                             } catch (SQLException ee) {
                                                 throw new RuntimeException(ee);
                                             }
                                         }
                                        else if(result.getString("Class3").equals("null"))
                                        {
                                            try {
                                                Connection connn = getConnection();

                                                class3Name.setText(className.getText());
                                                class3Section.setText(section.getText());
                                                class1white.setVisible(false);
                                                class2white.setVisible(false);
                                                class3white.setVisible(false);

                                                background1.setVisible(true);
                                                core.setVisible(true);

                                                String sst = "UPDATE userinfo SET Class3 = '" + class3Name.getText() + "', Section3 = '" + class3Section.getText() + "' WHERE Email = '" + glob + "'";
                                                System.out.println("Hello");
                                                PreparedStatement insert = connn.prepareStatement(sst);
                                                insert.executeUpdate();
                                            } catch (SQLException ee) {
                                                throw new RuntimeException(ee);
                                            }
                                        }
                                     }

                                } catch (SQLException ee) {
                                    throw new RuntimeException(ee);
                                }


                                core2.setVisible(false);
                                background1.setVisible(true);
                                core.setVisible(true);
                            }
                        });

                        background1.setVisible(true);
                        core2.setVisible(true);

                        //-----------------------------------------------end of create class method
                    }
                });


                //---------------------------------
                joinClass.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        core.setVisible(false);
                        JFrame Joincore = new JFrame();
                        Joincore.setBounds(200,20,400,700);
                        Joincore.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        Joincore.setLayout(null);
                        Joincore.setUndecorated(true);
                        Joincore.getContentPane().setBackground(Color.white);

                        JLabel JoinBackground = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\joinClass.jpg"));
                        JoinBackground.setBounds(0,0,400,700);
                        Joincore.add(JoinBackground);

                        JTextField classCodeText = new JTextField("");
                        classCodeText.setBounds(33,170,340,26);
                        classCodeText.setBackground( new Color( 255,255,255 ) );
                        classCodeText.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
                        classCodeText.setBorder(null);
                        JoinBackground.add(classCodeText);

                        JButton joinButton = new JButton("");
                        joinButton.setFocusPainted(false);
                        joinButton.setBounds(280,16,70,35);
                        joinButton.setBackground( new Color( 0, 0, 0, 200 ) );
                        joinButton.setOpaque(false);
                        joinButton.setBorder(null);
                        joinButton.setContentAreaFilled(false);
                        joinButton.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
                        joinButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        joinButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame joinedCLass = new JFrame();
                                joinedCLass.setBounds(200,20,400,700);
                                joinedCLass.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                                joinedCLass.setLayout(null);
                                joinedCLass.setUndecorated(true);
                                joinedCLass.getContentPane().setBackground(Color.white);

                                JLabel joinedCLassBack = new JLabel(new ImageIcon("C:\\Users\\Qasim\\IdeaProjects\\GoogleClassroomProject\\src\\PKG1\\AfterJoin.jpg"));
                                joinedCLassBack.setBounds(0,0,400,700);
                                joinedCLass.add(joinedCLassBack);
                                joinedCLass.setVisible(true);
                            }
                        });

                        JoinBackground.add(joinButton);
                        Joincore.setVisible(true);
                        Joincore.setVisible(true);
                    }
                });

            }
        });

        core.setVisible(true);
    }
}
