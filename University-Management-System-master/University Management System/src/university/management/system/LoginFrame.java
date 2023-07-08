/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;

/**
 *
 * @author fidel
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

public class LoginFrame extends JFrame implements ActionListener {

    private JLabel titleLabel, userLabel, passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginFrame() {
        // Set the title of the login form
        setTitle("Lecturer Login");
        // Create and customize UI components
        titleLabel = new JLabel("Lecturer Login Form");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        userTextField = new JTextField();

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        passwordField = new JPasswordField();
           

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Serif", Font.PLAIN, 18));
        loginButton.addActionListener(this);

        // Create a panel to hold the UI components
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // empty label for spacing
        panel.add(loginButton);

           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        //l3.setLocation(500, 200);
        add(l3);
        // Add UI components to the login form
        Container container = getContentPane();
        //container.setLayout(new BorderLayout());
        container.add(titleLabel, BorderLayout.NORTH);
        container.add(panel, BorderLayout.CENTER);

        // Set the size and visibility of the login form
        setSize(600,300);
        setLocation(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
          
    }

    @Override
//    public void actionPerformed(ActionEvent e) {
//        // Get the username and password from the UI components
//        String username = userTextField.getText();
//        String password = new String(passwordField.getPassword());
//
//        // Check if the username and password are correct
//        if (username.equals("lecturer") && password.equals("password")) {
//            JOptionPane.showMessageDialog(this, "Login successful!");
//            // TODO: Open the main application for the lecturer
//             new Project().setVisible(true);
//        } else {
//            JOptionPane.showMessageDialog(this, "Invalid username or password");
//        }
         public void actionPerformed(ActionEvent ae){

             Connection conn =null;
              String url = "jdbc:mysql://localhost/unimanagementsystem";
            String user = "root";
            String pass = "";
        try{
            //conn c1 = new conn();
            
            String username = userTextField.getText();
        String password = new String(passwordField.getPassword());
            
            String q = "select * from login where username='"+username+"' and password='"+password+"'";
            //Open connection
            conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q); 
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Login successful!");
                new Project().setVisible(true);
                setVisible(false);
            }else{
            JOptionPane.showMessageDialog(this, "Invalid username or password");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
//       public static void main(String[] args) {
//        // Create a new login form
//        new LoginFrame();
//    }

  
    }

    

