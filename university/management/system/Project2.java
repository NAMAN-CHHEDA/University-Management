package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project2 extends JFrame implements ActionListener {
    
    JButton crst, crte, vsd, vtd, dsd, dtd, etmar, rst, fst;

    Project2() {
        setSize(1540, 850);
                
        setLayout(null);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/svkmm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1540, 850);
        add(image);
        
        JLabel head = new JLabel("SVKM MANAGEMENT SYSTEM");
        head.setBounds(475, 30, 1500, 50);
        head.setFont(new Font("Tahoma", Font.BOLD, 30));
        image.add(head);
        
        crst = new JButton("Add Student Information");
        crst.setBounds(200, 150,300, 50);
        crst.setForeground(Color.BLUE);
        crst.addActionListener(this);
        image.add(crst);
        
        crte = new JButton("Add Faculty Information");
        crte.setBounds(900, 150,300, 50);
        crte.setForeground(Color.BLUE);
        crte.addActionListener(this);
        image.add(crte);
        
        vsd = new JButton("View Student Details");
        vsd.setBounds(200, 275,300, 50);
        vsd.setForeground(Color.BLUE);
        vsd.addActionListener(this);
        image.add(vsd);
        
        vtd = new JButton("View Faculty Details");
        vtd.setBounds(900, 275,300, 50);
        vtd.setForeground(Color.BLUE);
        vtd.addActionListener(this);
        image.add(vtd);
        
        dsd = new JButton("Remove Student Info");
        dsd.setBounds(200, 400,300, 50);
        dsd.setForeground(Color.BLUE);
        dsd.addActionListener(this);
        image.add(dsd);
        
        dtd = new JButton("Remove Faculty Info");
        dtd.setBounds(900, 400,300, 50);
        dtd.setForeground(Color.BLUE);
        dtd.addActionListener(this);
        image.add(dtd);
        
        etmar = new JButton("Enter Marks");
        etmar.setBounds(200, 525,300, 50);
        etmar.setForeground(Color.BLUE);
        etmar.addActionListener(this);
        image.add(etmar);
        
        rst = new JButton("Examination Results");
        rst.setBounds(900, 525,300, 50);
        rst.setForeground(Color.BLUE);
        rst.addActionListener(this);
        image.add(rst);
        
        fst = new JButton("Fee Structure");
        fst.setBounds(560, 650,300, 50);
        fst.setForeground(Color.BLUE);
        fst.addActionListener(this);
        image.add(fst);
        
        
        JMenuBar mb = new JMenuBar();
        
        // Home
        JMenu home = new JMenu("Home");
        mb.add(home);
        
        JMenuItem Home1 = new JMenuItem("Home");
        Home1.setBackground(Color.BLUE);
        Home1.addActionListener(this);
        home.add(Home1);
        
        // about
        JMenu about = new JMenu("About");
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        // exit
        JMenu exit = new JMenu("Exit");
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Home"))
        {
            setVisible(false);
            new Project2();
        }
        else if (msg.equals("Exit")) 
        {
            setVisible(false);
        }
        else if (msg.equals("Add Faculty Information"))
        {
            new AddTeacher();
        }
        else if (msg.equals("Add Student Information"))
        {
            new AddStudent();
        }
        else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        }
        else if (msg.equals("View Student Details")) {
            new StudentDetails();
        }
        else if (msg.equals("Enter Marks"))
        {
            new EnterMarks();
        } else if (msg.equals("Examination Results"))
        {
            new ExaminationDetails();
        }
        else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About"))
        {
            new About();
        }
        else if (msg.equals("Remove Student Info"))
        {
            new RemoveStudent();
        }
        else if (msg.equals("Remove Faculty Info"))
        {
            new RemoveTeacher();
        }
    }

    public static void main(String[] args)
    {
        new Project2();
    }
}