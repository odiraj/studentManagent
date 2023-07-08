/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    JButton b3;

    Login(){

        super("Login");

        setBackground(Color.YELLOW);
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.white);
        b1.setForeground(Color.green);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.white);
        b2.setForeground(Color.red);
        add(b2);

       
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.YELLOW);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);
        
        
        b3=new JButton("Register");
        b3.setBounds(320,140,120,30);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.white);
        b3.setForeground(Color.blue);
        add(b3);

       
        b3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);

    }

    public void actionPerformed(ActionEvent ae){

        Connection conn =null;
        if(ae.getSource()==b1){
            String url = "jdbc:mysql://localhost/unimanagementsystem";
            String user = "root";
            String pass = "";
            
            //
        try{
            //conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
            
            //Open connection
            conn = DriverManager.getConnection(url, user, pass);
            String q = "select * from register where username='"+u+"' and password='"+v+"'";
            
            //Create statement
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q); 
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "login Successful");
                new StudentPage().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
            //Clean-up environment
            
            rs.close();
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }}
        else if(ae.getSource()==b2){
        System.exit(0);
        }
        else if(ae.getSource()==b3){
        JOptionPane.showMessageDialog(null,"Register Page will appear here");
        new Register();
        }
    }
//    public static void main(String[] arg){
//        Login l = new Login();
//    }
}