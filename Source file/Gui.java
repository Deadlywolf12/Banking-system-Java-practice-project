package bank;

import javax.swing.*;
import java.awt.*;

import java.security.SecureRandom;
import java.sql.*;
import java.util.Arrays;


public class Gui  {

    //declaring gui elements
    JFrame jf;

    int temp,temp2;
    private boolean cardStatus;
    private int cardNum;
    private int cvcNum;
    private String cardTitle2;
    private String cardType;

    JPanel jp, jp1, jp2, jpc,userP,jpD,jpW,jpCardP;

    JLabel cardTitle,promt;
    JButton cardOrderBtn,cardBack;
    JTextArea cardDetails;

    JPasswordField jpass, jpass1;
    JTextField tf1, tf2,tf3,tf4;
    JLabel jl, jl1, jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14;
    JButton jb1, jb2, jb3, jb4, jbback, jbback1,jb5,jb6,jb7,jb8,jbback2,jbexit,jbamt1,jbamt2,jbamt3,jbamt4,jbamt5,jbamt6,jbamt7,jbamt8,jbamt9,jbamt10,jbamt11,jbamt12,jbback3,jb9,clear1,clear2,jbCard;
    ///end of line

    public Gui() {
// main frame
        User uObj = new User();
        jf = new JFrame("DUIB");
        jf.setVisible(true);

        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ///end of line

// home screen
        jp = new JPanel();
        jpc = new JPanel();
        jp.setLayout(null);




        jl = new JLabel("Wellcome back ! what would u like to perform?");
        jl.setBounds(50, 70, 500, 25);

        jb1 = new JButton("Login");
        jb1.setBounds(170, 120, 100, 25);
        jb2 = new JButton("Register");
        jb2.setBounds(170, 170, 100, 25);

        jl12=new JLabel("Paisa Barbad Bank LTD");

        jl12.setFont(new Font("Tahoma", Font.BOLD, 20));
        jl12.setBounds(100, 30, 500, 25);


        jbexit=new JButton("Exit");
        jbexit.setBounds(170, 220, 100, 25);
        ///end of line


//        adding home components to home panel
        jp.add(jl);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jl12);
        jp.add(jbexit);
        ///end of line


        //register screen
        jp1 = new JPanel();
        jp1.setLayout(null);


        jl1 = new JLabel("REGISTER");
        jl1.setBounds(170, 50, 150, 25);
        jl1.setFont(new Font("Tahoma", Font.BOLD, 20));

        tf1 = new JTextField();
        tf1.setBounds(170, 100, 120, 25);

        jpass = new JPasswordField();
        jpass.setBounds(170, 150, 120, 25);

        jb3 = new JButton("Submit");
        jb3.setBounds(170, 200, 100, 25);



        jbback = new JButton("Back");
        jbback.setBounds(170, 300, 100, 25);

        jl10 = new JLabel("Name:");
        jl10.setBounds(120, 100, 50, 25);

        jl11 = new JLabel("Password:");
        jl11.setBounds(100, 150, 60, 25);


        ///end of line

//        adding regis components to login panel
        jp1.add(jl1);
        jp1.add(tf1);
        jp1.add(jpass);
        jp1.add(jb3);
        jp1.add(jbback);
        jp1.add(jl10);
        jp1.add(jl11);
//        jp1.add(jl3);

        ///end of line

        //login screen
        jp2 = new JPanel();
        jp2.setLayout(null);



        jl2 = new JLabel("LOGIN");
        jl2.setBounds(170, 50, 150, 25);
        jl2.setFont(new Font("Tahoma", Font.BOLD, 20));


        tf2 = new JTextField();
        tf2.setBounds(170, 100, 120, 25);

        jpass1 = new JPasswordField();
        jpass1.setBounds(170, 150, 120, 25);

        jb4 = new JButton("Submit");
        jb4.setBounds(170, 200, 100, 25);
        jl8 = new JLabel("Name:");
        jl8.setBounds(120, 100, 50, 25);

        jl9 = new JLabel("Password:");
        jl9.setBounds(100, 150, 60, 25);






        jbback1 = new JButton("Back");
        jbback1.setBounds(170, 300, 100, 25);
        ///end of line


//        adding login components to login panel
        jp2.add(jl2);
        jp2.add(tf2);
        jp2.add(jpass1);

        jp2.add(jb4);
        jp2.add(jbback1);
        jp2.add(jl8);
        jp2.add(jl9);
        ///end of line

        //UserScreen

        userP=new JPanel(null);

        jl3=new JLabel("Dashboard");
        jl3.setFont(new Font("Tahoma", Font.BOLD, 20));
        jl3.setBounds(170, 50, 150, 25);

        jl4=new JLabel();
        jl4.setBounds(30, 70, 150, 25);

        jl4.setFont(new Font("Tahoma", Font.BOLD, 15));


        jl5=new JLabel();
        jl5.setBounds(30, 100, 150, 25);

        jl5.setFont(new Font("Tahoma", Font.BOLD, 15));

        jb5 = new JButton("Deposit");
        jb5.setBounds(170, 120, 100, 25);
        jb6 = new JButton("Withdraw");
        jb6.setBounds(170, 170, 100, 25);
        jbCard = new JButton("Debit Card");
        jbCard.setBounds(170, 220, 100, 25);



        jb7 = new JButton("Logout");
        jb7.setBounds(170, 270, 100, 25);
        //        adding dashboard components to login panel

        userP.add(jl3);
        userP.add(jl4);
    userP.add(jl5);
    userP.add(jb5);
    userP.add(jb6);
    userP.add(jb7);
        userP.add(jbCard);
        ///end of line

//        Deposit Screen
jpD=new JPanel(null);
        jl6=new JLabel("Deposit");
        jl6.setFont(new Font("Tahoma", Font.BOLD, 20));
        jl6.setBounds(170, 50, 150, 25);

       jbamt1= new JButton("1000");
        jbamt1.setBounds(50, 150, 120, 25);
        jbamt2= new JButton("3000");
        jbamt2.setBounds(50, 200, 120, 25);
        jbamt3= new JButton("5000");
        jbamt3.setBounds(50, 250, 120, 25);
        jbamt4= new JButton("10,000");
        jbamt4.setBounds(300, 150, 120, 25);
        jbamt5= new JButton("15,000");
        jbamt5.setBounds(300, 200, 120, 25);
        jbamt6= new JButton("20,000");
        jbamt6.setBounds(300, 250, 120, 25);





tf3=new JTextField("$$$$");
        tf3.setEditable(false);
        tf3.setBounds(30,350,100,25);
        jb8 = new JButton("Add");
        jb8.setBounds(170, 350, 120, 25);
        clear1= new JButton("Clear");
        clear1.setBounds(300,350,120,25);

        jbback2 = new JButton("Back");
        jbback2.setBounds(220, 400, 120, 25);

        jl7=new JLabel();
        jl7.setBounds(30, 100, 150, 25);

        jl7.setFont(new Font("Tahoma", Font.BOLD, 15));



        ///adding components of deposit screen
        jpD.add(jl6);
        jpD.add(clear1);

        jpD.add(jb8);
        jpD.add(jbback2);
        jpD.add(jl7);
        jpD.add(jbamt1);
        jpD.add(jbamt2);
        jpD.add(jbamt3);
        jpD.add(jbamt4);
        jpD.add(jbamt5);
        jpD.add(jbamt6);
        jpD.add(tf3);
        ///end of line
//        Withdraw Screen
        jpW=new JPanel(null);
        jl13=new JLabel("Withdraw");
        jl13.setFont(new Font("Tahoma", Font.BOLD, 20));
        jl13.setBounds(170, 50, 150, 25);

        jbamt7= new JButton("1000");
        jbamt7.setBounds(50, 150, 120, 25);
        jbamt8= new JButton("3000");
        jbamt8.setBounds(50, 200, 120, 25);
        jbamt9= new JButton("5000");
        jbamt9.setBounds(50, 250, 120, 25);
        jbamt10= new JButton("10,000");
        jbamt10.setBounds(300, 150, 120, 25);
        jbamt11= new JButton("15,000");
        jbamt11.setBounds(300, 200, 120, 25);
        jbamt12= new JButton("20,000");
        jbamt12.setBounds(300, 250, 120, 25);


        tf4=new JTextField("$$$$");
        tf4.setEditable(false);
        tf4.setBounds(30,350,100,25);
        jb9 = new JButton("Withdraw");
        jb9.setBounds(170, 350, 120, 25);

        clear2= new JButton("Clear");
        clear2.setBounds(300,350,120,25);

        jbback3 = new JButton("Back");
        jbback3.setBounds(170, 400, 120, 25);

        jl14=new JLabel();
        jl14.setBounds(30, 100, 150, 25);

        jl14.setFont(new Font("Tahoma", Font.BOLD, 15));



        ///adding components of deposit screen
        jpW.add(jl13);
        jpW.add(clear2);

        jpW.add(jb9);
        jpW.add(jbback3);
        jpW.add(jl14);
        jpW.add(jbamt7);
        jpW.add(jbamt8);
        jpW.add(jbamt9);
        jpW.add(jbamt10);
        jpW.add(jbamt11);
        jpW.add(jbamt12);
        jpW.add(tf4);
        ///end of line

        // coloring the comonents
        //panels
        jpW.setBackground(Color.black);
        jp.setBackground(Color.black);
        jp1.setBackground(Color.black);
        jp2.setBackground(Color.black);
        jpD.setBackground(Color.black);
        userP.setBackground(Color.black);
        //labels
        jl.setForeground(Color.white);
        jl1.setForeground(Color.white);
        jl10.setForeground(Color.white);
        jl7.setForeground(Color.yellow);
        jl14.setForeground(Color.yellow);
        jl5.setForeground(Color.yellow);
        jl4.setForeground(Color.yellow);
        jl12.setForeground(Color.red);

        jl11.setForeground(Color.white);
        jl2.setForeground(Color.white);
        jl8.setForeground(Color.white);
        jl9.setForeground(Color.white);
        jl3.setForeground(Color.white);
        jl6.setForeground(Color.white);
        jl13.setForeground(Color.white);
        //buttons

        //debit card panel


        jpCardP = new JPanel(null);

        cardTitle = new JLabel("Debit/Credit Card");
        cardTitle.setBounds(100,0,200,50);

        promt = new JLabel("you dont have a card  yet order now");
        promt.setBounds(30,100,200,30);

        cardOrderBtn = new JButton("Order Now");
        cardOrderBtn.setBounds(30,150,100,30);

        cardDetails = new JTextArea();
        cardDetails.setBounds(150,150,200,200);

        cardBack = new JButton("Back");
        cardBack.setBounds(200,380,100,30);

        jpCardP.add(cardDetails);
        jpCardP.add(cardBack);
        jpCardP.add(cardOrderBtn);
        jpCardP.add(cardTitle);
        jpCardP.add(promt);

















//initializing cardlayout
        CardLayout c1 = new CardLayout();

        jpc.setLayout(c1);
        // 0 for home
        jpc.add(jp, "0");
        // 1 for register
        jpc.add(jp1, "1");
        // 2 for login
        jpc.add(jp2, "2");
        // 3 for userscreen
        jpc.add(userP,"3");
        // 4 for Deposit screen
        jpc.add(jpD,"4");
        // 5 for withdraw screen
        jpc.add(jpW,"5");
        jpc.add(jpCardP,"6");
        jf.add(jpc);


        c1.show(jpc, "0");
///end of line

//actions to button
        // "Home Screen"
        // login button

        jb1.addActionListener(e -> c1.show(jpc, "2"));
        // register button
        jb2.addActionListener(e -> c1.show(jpc, "1"));
        //end of line

        // "REGISTRATION BUTTONS IMPLEMENTATION"
        // back button
        jbback.addActionListener(e-> c1.show(jpc, "0"));

        //  submit button
        jb3.addActionListener(e -> {
            String gUN = tf1.getText();
            String gUP = Arrays.toString(jpass.getPassword());



            uObj.lenCheck1 = gUN.length();
            uObj.lenCheck2 = gUP.length();

            if (uObj.lenCheck1 >= 4 && uObj.lenCheck2 >= 24) {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pib_db", "root", "");

                    String query = "INSERT INTO pib_data (u_name,password) VALUES ('" + gUN + "','" + gUP + "')";

                    Statement sta = connection.createStatement();
                    sta.executeUpdate(query);
//
                    connection.close();
//


                    c1.show(jpc,"2");
                    tf1.setText("");
                    jpass.setText("");
                    JOptionPane.showMessageDialog(jf,"Succesfult Registered in","Prompt",JOptionPane.WARNING_MESSAGE);
                    connection.close();

               } catch (SQLException ex) {
                    throw new RuntimeException(ex);
//                    JOptionPane.showMessageDialog(jf,"Username already exist","Prompt",JOptionPane.WARNING_MESSAGE);
                   
               }


           }
            else{
                tf1.setText("");
                jpass.setText("");
                JOptionPane.showMessageDialog(jf,"Username and pass must be greater than 8","Prompt",JOptionPane.WARNING_MESSAGE);

            }


        });
        ///end of line

        // "LOGIN BUTTON ACTION IMPLEMENTATION"
        // submit button
        jb4.addActionListener(e -> {
            String gUN2 = tf2.getText();
            String gUP2 = Arrays.toString(jpass1.getPassword());



                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pib_db", "root", "");


                    Statement sta = connection.createStatement();
                    String query = "select * from pib_data where u_Name = '" + gUN2+ "' and password = '"+ gUP2 + "'";
                   ResultSet rs = sta.executeQuery(query);
                   if (rs.next()){
                       JOptionPane.showMessageDialog(jf,"Wellcome Back","Prompt",JOptionPane.WARNING_MESSAGE);
                       uObj.setpUserName(gUN2);
                       c1.show(jpc, "3");
                       jl4.setText("Hello! "+ gUN2);



                       Statement sta2 = connection.createStatement();
                       String query2 = "select * from pib_data where u_Name = '" + gUN2+ "'";
                       ResultSet rs2 = sta2.executeQuery(query2);
                       while (rs2.next()) {
                           uObj.setpBal(rs2.getInt(3));
                           cardStatus = rs2.getBoolean("cardStatus");
                       }

                       jl5.setText("Balance= "+uObj.getpBal()+"$");

                       tf2.setText("");
                       jpass1.setText("");
                       String query3 = "select * from card where cardTitle = '" + gUN2+ "'";
                       ResultSet rs3 = sta.executeQuery(query3);


                       while (rs3.next()){
                           cardNum = rs3.getInt("cardNum");
                           cvcNum = rs3.getInt("cardCvc");
                           cardTitle2 = rs3.getString("cardTitle");
                           cardType = rs3.getString("cardType");

                       }


                   }
                   else{
                       JOptionPane.showMessageDialog(jf,"Wrong Username or Password","Prompt",JOptionPane.WARNING_MESSAGE);
                       tf2.setText("");
                       jpass1.setText("");
                   }
//
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }


        });
        //  back button
        jbback1.addActionListener(e -> c1.show(jpc, "0"));
        ///end of line


// "USER DASHBOARD BUTTONS IMPLEMENTATION"
// exit button
        jbexit.addActionListener(e-> jf.dispose());
        //  Deposit button
        jb5.addActionListener(e-> {
            c1.show(jpc,"4");
            jl7.setText("Balance= "+uObj.getpBal()+"$");

        });
        // withdraw button
        jb6.addActionListener(e-> {
            c1.show(jpc,"5");
            jl14.setText("Balance= "+uObj.getpBal()+"$");});
        // logout button
        jb7.addActionListener(e->{
            c1.show(jpc,"0");
            uObj.setChklog(0);

        });
        //"ALL DEPOSIT BUTTONS IMPLEMENTATION"
        jbamt1.addActionListener(e->{
            temp=1000;

            tf3.setText(temp+ "$");

        });
        jbamt2.addActionListener(e->{
            temp=3000;

            tf3.setText(temp+ "$");

        });
        jbamt3.addActionListener(e->{
            temp=5000;

            tf3.setText(temp+ "$");

        });
        jbamt4.addActionListener(e->{
            temp=10000;

            tf3.setText(temp+ "$");

        });
        jbamt5.addActionListener(e->{
            temp=15000;

            tf3.setText(temp+ "$");

        });
        jbamt6.addActionListener(e->{
            temp=20000;

            tf3.setText(temp+ "$");

        });
        jb8.addActionListener(e->{
            tf3.setText(uObj.uDeposit(temp));
            if (uObj.getDepoChk()==1) {
                jl7.setText("Balance= " + uObj.getpBal() + "$");
                temp = 0;


                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pib_db", "root", "");
                    Statement sta2 = connection.createStatement();
                    String query2 = "UPDATE pib_data SET balance ='" + uObj.getpBal()+ "'WHERE u_Name ='"+ uObj.getpUserName() + "'";
                   sta2.executeUpdate(query2);


                    jl5.setText("Balance= " + uObj.getpBal() + "$");


//
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }


        });
        jbback2.addActionListener(e->{
            c1.show(jpc,"3");
            jl5.setText("Balance= "+uObj.getpBal()+"$");

        }
        );
        clear1.addActionListener(e -> {
            tf3.setText("$$$$");
            temp=0;


        });
        //end of line

// " ALL WITHDRAW SCREEN BUTTONS ACTION IMPLEMENTATION"
        // back button
        jbback3.addActionListener(e-> {
            c1.show(jpc, "3");
            jl5.setText("Balance= " + uObj.getpBal() + "$");
        });

        // withdraw button

        jb9.addActionListener(e->{
   tf4.setText(uObj.uWithdraw(temp2));
            if (uObj.getWithChk()==1){
                jl14.setText("Balance= "+uObj.getpBal()+"$");
                temp2=0;

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pib_db", "root", "");
                    Statement sta2 = connection.createStatement();
                    String query2 = "UPDATE pib_data SET balance ='" + uObj.getpBal()+ "'WHERE u_Name ='"+ uObj.getpUserName() + "'";
                 sta2.executeUpdate(query2);


                    jl5.setText("Balance= " + uObj.getpBal() + "$");


//
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }



        });
        jbamt7.addActionListener(e -> {
            temp2=1000;

            tf4.setText(temp2+ "$");

                }
            );
        jbamt8.addActionListener(e -> {
            temp2=3000;

            tf4.setText(temp2+ "$");
                }
        );
        jbamt9.addActionListener(e -> {
                    temp2=5000;

                    tf4.setText(temp2+ "$");
                }
        );
        jbamt10.addActionListener(e -> {
                    temp2=10000;

                    tf4.setText(temp2+ "$");
                }
        );
        jbamt11.addActionListener(e -> {
                    temp2=15000;

                    tf4.setText(temp2+ "$");
                }
        );
        jbamt12.addActionListener(e -> {
                    temp2=20000;

                    tf4.setText(temp2+ "$");
                }
        );
        clear2.addActionListener(e -> {
            tf4.setText("$$$$");
            temp2=0;


        });


        // debit/credit card buttons action implimentation

        cardBack.addActionListener(e->c1.show(jpc,"3"));
        cardOrderBtn.addActionListener(e->{
            SecureRandom rand = new SecureRandom();

            int upperBound = 1000000000;
            int cvcUpperB = 999;
            cardNum = rand.nextInt(upperBound);
            cardTitle2 = uObj.getpUserName().toUpperCase();
            cvcNum = rand.nextInt(cvcUpperB);
            cardType = "Visa";



            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pib_db", "root", "");
                String query = "INSERT INTO card (cardNum,cardTitle,cardCvc,cardType) VALUES ('" + cardNum + "','" + cardTitle2 + "','" + cvcNum + "','" + cardType + "')";

                String query2 = "update  pib_data set cardStatus = 1 where u_name = '"+uObj.getpUserName()+"'";
                Statement sta = connection.createStatement();
                sta.executeUpdate(query);
                sta.executeUpdate(query2);

//
                connection.close();
                promt.setVisible(false);
                cardOrderBtn.setVisible(false);
                cardDetails.setText("Card details\n"+
                        "Card Number : "+ cardNum+ "\n"+
                        "Title : "+cardTitle2+"\n"+
                        "Cvc : "+cvcNum+"\n"+
                        "Type : "+cardType+"\n");
                cardStatus=true;



            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }


        });
        jbCard.addActionListener(e->{
            c1.show(jpc,"6");
            if (cardStatus){
                promt.setVisible(false);
                cardOrderBtn.setVisible(false);
                cardDetails.setText("Card details\n"+
                        "Card Number : "+ cardNum+ "\n"+
                        "Title : "+cardTitle2+"\n"+
                        "Cvc : "+cvcNum+"\n"+
                        "Type : "+cardType+"\n");


            }
        });








    }



    public static void main(String[] args) {

        new Gui();

    }


}

