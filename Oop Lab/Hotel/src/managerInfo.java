package Hotel.src;

import  net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class managerInfo extends JFrame {
    managerInfo(){
        JPanel p = new JPanel();
        p.setBounds(5,5,990,590);
        p.setBackground(new Color(3,45,48));
        p.setLayout(null);
        add(p);

        JTable t=new JTable();
        t.setBounds(10,34,980,450);
        t.setForeground(Color.white);
        t.setBackground(new Color(3,45,48));
        p.add(t);

        try{
            con1 c=new con1();
            String q="select * from Employee where job='Manager' ";
            ResultSet r=c.s.executeQuery(q);
            t.setModel(DbUtils.resultSetToTableModel(r));
        }catch(Exception e){
            e.printStackTrace();
        }
        JButton b1=new JButton("Back");
        b1.setBounds(350,500,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p.add(b1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });

        JLabel n=new JLabel("Name");
        n.setBounds(41,11,70,19);
        n.setForeground(Color.WHITE);
        n.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(n);

        JLabel Age = new JLabel("Age");
        Age.setBounds(159,11,70,19);
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(Age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(273,11,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(gender);

        JLabel job = new JLabel("Job");
        job.setBounds(416,11,70,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(536,11,70,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(salary);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(656,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(phone);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(786,11,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(gmail);

        JLabel aadhar = new JLabel("Aadhar");
        aadhar.setBounds(896,11,70,19);
        aadhar.setForeground(Color.WHITE);
        aadhar.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(aadhar);

        setUndecorated(true);
        setLayout(null);
        setLocation(430,100);
        setSize(1000,600);
        setVisible(true);

    }
    public static void main(String[] args) {
        new managerInfo();
    }
}
