/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;

/**
 *
 * @author fidel
 */

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class StudentPage extends JFrame implements ActionListener {
 JMenu menu;
 JMenu menu2;
 JMenu menu3;
 JMenu menu4;
 JMenu menu5;
 JMenuItem item;
        JMenuItem item2;
 JMenuItem item3;
 JMenuItem item4,item5,item6,item7,item8,item9,item10,item11,item12;
 
StudentPage(){
  ImageIcon icon= new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/fifth.jpg"));

  JLabel label=new JLabel();
  label.setSize(5000,900);
  label.setIcon(icon);

  JPanel panel=new JPanel();
  //panel.setBackground(Color.MAGENTA);
  panel.setLayout(null);
  panel.setSize(5000,900);
  panel.add(label);
  

    JMenuBar bar = new JMenuBar();
    bar.setBackground(Color.BLACK);
    //Box.Filler horizontalGlue = new Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(Integer.MAX_VALUE, 0));
    //bar.add(menu5);
    //bar.add(menu4);
      
      
    menu = new JMenu("FEE DETAILS");
    menu.setForeground(Color.GREEN);
    bar.add(menu);
    
     menu2 = new JMenu("PROGRAM");
     menu2.setForeground(Color.yellow);
     
     
    bar.add(menu2);
    
     menu3 = new JMenu("EXAM");
     menu3.setForeground(Color.BLUE);
    
    bar.add(menu3);
   
  
   menu4 = new JMenu("HELP");
   menu4.setForeground(Color.yellow);
  
     
  
    bar.add(menu4);
    
     menu5 = new JMenu("EXIT");
     menu5.setForeground(Color.RED);
   
    bar.add(menu5);
  
    // item= new JMenuItem("Semester 1");
     
     item2= new JMenuItem("FeeStructure");
     item2.addActionListener(this);
     item3= new JMenuItem("check balance");
     item4= new JMenuItem("results");
     item5= new JMenuItem("Electrical Engineering");
     item6= new JMenuItem("School of Law");
     item7= new JMenuItem("School of Nursing");
     item8= new JMenuItem("Computer Science");
     item8.addActionListener(this);
     item9= new JMenuItem("Education");
     item10= new JMenuItem("Economics");
     item11=new JMenuItem("Exit");
     item12=new JMenuItem("Help");

     item12.setHorizontalAlignment(JMenuItem.RIGHT);
     item11.setHorizontalAlignment(JMenu.RIGHT);
     item12.addActionListener(this);
     item11.addActionListener(this);

     item4.addActionListener(this);
    menu3.add(item4);
  // menu.add(item);
    menu.add(item2);
    menu.add(item3);
    menu2.add(item5);
    menu2.add(item6);
    menu2.add(item7);
    menu2.add(item8);
    menu2.add(item9);
    menu2.add(item10);
    menu5.add(item11);
    menu4.add(item12);


    setJMenuBar(bar);
    setVisible(true);

    this.setTitle("STUDENT PAGE");
    this.setExtendedState(MAXIMIZED_BOTH);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.setSize(600,500);
    this.setVisible(true);
    this.setLayout(new BorderLayout());
    this.add(bar,BorderLayout.NORTH);
    this.setJMenuBar(bar);
    this.add(panel);

    
        //JOptionPane.showMessageDialog("Hello");
      }
@Override
public void actionPerformed(ActionEvent e) {
 if(e.getSource()== item11) {
  //JOptionPane.showMessageDialog(null, "Hello");
  System.exit(0);
        }
                if (e.getSource()==item12){
                        JOptionPane.showMessageDialog(null, "Visit the administration block");

                        }
  
                        if (e.getSource()==item8){
                          JOptionPane.showMessageDialog(null, "ACSC 102, ACSC 224, MATHS 100, COSC 102, ZOOL 100");
  
                          }
                        if (e.getSource()==item4){
  JOptionPane.showMessageDialog(null, "Your results will appear here.");
            new ExaminationDetails();
  
                          }
 // TODO Auto-generated method stubi
         String msg = e.getActionCommand();
        if(msg.equals("FeeStructure")){
            JOptionPane.showMessageDialog(null, "Feestructure statement will appear here.");
              new FeeStructure().setVisible(true);
             
        }
        else if(msg.equals("Exit")){
            System.exit(0);
        }
	
}

//public static void main(String[]args) {
//     new StudentPage().setVisible(true);
// 
//}
}
