/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;

/**
 *
 * @author fidel
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register extends JFrame implements ActionListener {
    private JTextField usernameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton, cancelButton;

    public Register() {
        setTitle("Register Page");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //setContentPane(new JLabel(new ImageIcon("background.jpg")));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        usernameField.setPreferredSize(new Dimension(80,20));
        panel.add(usernameLabel);
        panel.add(usernameField);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        emailField.setPreferredSize(new Dimension(80,20));
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
       passwordField.setPreferredSize(new Dimension(80,20));
        panel.add(passwordLabel);
        panel.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField(20);
        confirmPasswordField.setPreferredSize(new Dimension(80,20));
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);

        registerButton = new JButton("Register");
        registerButton.setSize(80,30);
        registerButton.setForeground(Color.BLUE);
        cancelButton = new JButton("Cancel");
        cancelButton.setForeground(Color.RED);
        cancelButton.setSize(80,30);
        panel.add(registerButton);
        panel.add(cancelButton);

        add(panel, BorderLayout.CENTER);
        setVisible(true);

        registerButton.addActionListener(this);
        cancelButton.addActionListener(this);


    }
  public void actionPerformed(ActionEvent e) {
    Connection conn = null;

    if (e.getSource() == registerButton) {
        
        String url = "jdbc:mysql://localhost/unimanagementsystem";
        String user = "root";
        String pass = "";
        String username = usernameField.getText();
        String password = passwordField.getText();
        String email = emailField.getText();

        PreparedStatement stmt = null;

        try {
            // create a connection object
            conn = DriverManager.getConnection(url, user, pass);

            // prepare statements for inserting data
            String sql = "INSERT INTO `register`(`Username`, `Email`, `Password`) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);

            // set the values of the prepared statement
            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, password);

            // execute the statement and insert the data in the database
            int rows = stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "User registered successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    if(e.getSource()== cancelButton){
    System.exit(0);
    }
}


//    public static void main(String[] args) {
//        Register registerPage = new Register();
//        registerPage.setVisible(true);
//    }
}

