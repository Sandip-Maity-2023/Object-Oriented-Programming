package Hotel.src;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class employee extends JFrame {
    employee(){

        JPanel p = new JPanel();
        p.setBounds(5,5,990,590);
        p.setBackground(new Color(3,45,48));
        p.setLayout(null);
        add(p);

        JTable t = new JTable();
        t.setBounds(10,34,980,450);
        t.setForeground(Color.WHITE);
        t.setBackground(new Color(3,45,48));
        p.add(t);

        try{
            con1 c = new con1();
            String EmployeeSQL = "select * from Employee";
            ResultSet resultSet = c.s.executeQuery(EmployeeSQL);
            t.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        p.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel n = new JLabel("Name");
        n.setBounds(41,11,70,19);
        n.setForeground(Color.WHITE);
        n.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(n);

        JLabel a = new JLabel("Age");
        a.setBounds(159,11,70,19);
        a.setForeground(Color.WHITE);
        a.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(a);

        JLabel g = new JLabel("Gender");
        g.setBounds(273,11,70,19);
        g.setForeground(Color.WHITE);
        g.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(g);

        JLabel j = new JLabel("Job");
        j.setBounds(416,11,70,19);
        j.setForeground(Color.WHITE);
        j.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(j);

        JLabel s = new JLabel("Salary");
        s.setBounds(536,11,70,19);
        s.setForeground(Color.WHITE);
        s.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(s);

        JLabel p1 = new JLabel("Phone");
        p1.setBounds(656,11,70,19);
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(p1);

        JLabel g1 = new JLabel("Gmail");
        g1.setBounds(786,11,70,19);
        g1.setForeground(Color.WHITE);
        g1.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(g1);

        JLabel a1 = new JLabel("Aadhar");
        a1.setBounds(896,11,70,19);
        a1.setForeground(Color.WHITE);
        a1.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(a1);

        setUndecorated(true);
        setLayout(null);
        setLocation(430,100);
        setSize(1000,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new employee();
    }
}
