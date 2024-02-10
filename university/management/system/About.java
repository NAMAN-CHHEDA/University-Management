package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fatte.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 0, 250, 450);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("<html>Developed By:<br/>Jay Chotalia<br/>Naman Chheda<br/>Chaitya Shah</html>");
        name.setBounds(20, 30, 550, 400);
        name.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(name);
        
        JLabel rollno = new JLabel("<html>SAP ID: <br/>60009210027<br/>60009210038<br/>60009210054</html>");
        rollno.setBounds(225, 30, 550, 400);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(rollno);
        
        JLabel contact = new JLabel("<html>Contact: <br/>jaychotalia11@gmail.com<br/>namanchheda3@gmail.com<br/>chaityashah540@gmail.com</html>");
        contact.setBounds(70, 275, 550, 200);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}