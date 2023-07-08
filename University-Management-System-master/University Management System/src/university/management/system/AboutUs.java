package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AboutUs  extends JFrame implements ActionListener{

	private JPanel contentPane;

//        public static void main(String[] args) {
//            new AboutUs().setVisible(true);
      
//	}
    
        public AboutUs() {
            
            super("About Us");
            
             setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/third.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 750,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
            
            //MenuBar
            JMenuBar n = new JMenuBar();
        JMenu login = new JMenu("Login");

        JMenuItem student = new JMenuItem("Student");
        JMenuItem lecturer = new JMenuItem("Lecturer");

        login.setForeground(Color.BLUE);

        student.setFont(new Font("monospaced", Font.BOLD, 16));
        ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image image19 = icon18.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        student.setIcon(new ImageIcon(image19));
        student.setMnemonic('S');
        student.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        student.setBackground(Color.WHITE);

        lecturer.setFont(new Font("monospaced", Font.BOLD, 16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        lecturer.setIcon(new ImageIcon(image19));
        lecturer.setMnemonic('L');
        lecturer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        lecturer.setBackground(Color.WHITE);

        student.addActionListener(this);
        lecturer.addActionListener(this);

        // exit option
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);

        ex.setFont(new Font("monospaced", Font.BOLD, 16));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);

        // Add components to the menu
        login.add(student);
        login.add(lecturer);

        exit.add(ex);

       // Add components to the menu bar
       n.add(Box.createHorizontalGlue());
       n.add(login);
       n.add(exit);

       // Set the horizontal alignment of the menu components
       login.setHorizontalAlignment(JMenu.RIGHT);
       exit.setHorizontalAlignment(JMenu.RIGHT);

        setJMenuBar(n);
        setVisible(true);
          JLabel l = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/fifth.jpg"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i = new ImageIcon(i2);
            l = new JLabel(i);
            l.setBounds(400, 40, 250, 100);
            contentPane.add(l1);

            //contentPane.add(n);

            JLabel l3 = new JLabel("University");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Courier new", Font.BOLD, 30));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Management System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Courier New", Font.BOLD, 30));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

           //contentPane.setResizeable(false);

            JLabel l6 = new JLabel(" Head of the Table");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l8 = new JLabel("LIfe so cool ");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("ROMAN REIGNS design");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Phone -0797332840");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.GREEN);
//            JFrame about = new JFrame();
//            //about.setResizeable(false);
//            about.add(contentPane);
// ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/aa.jpg"));
//        Image i3 = ic.getImage().getScaledInstance(1900, 750,Image.SCALE_DEFAULT);
//        ImageIcon icc3 = new ImageIcon(i3);
//        JLabel l1 = new JLabel(icc3);
//        
//        add(l1);
	}
        
 public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Student")) {
            JOptionPane.showMessageDialog(this, "Add Student form will open here");
            new Login().setVisible(true);
        } else if (msg.equals("Lecturer")) {
            JOptionPane.showMessageDialog(this, "Add Lecturer form will open here");
            new LoginFrame().setVisible(true);
        } else if (msg.equals("Exit")) {
            System.exit(0);
        }

    }

   
          
}


