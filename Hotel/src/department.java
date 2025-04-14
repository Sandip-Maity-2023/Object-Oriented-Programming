package Hotel.src;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class department extends JFrame {
    department(){
        JPanel p = new JPanel();
        p.setBackground(new Color(3,45,48));
        p.setBounds(5,5,690,490);
        p.setLayout(null);
        add(p);

        JTable t = new JTable();
        t.setBounds(0,40,700,350);
        t.setBackground(new Color(4,45,48));
        t.setForeground(Color.WHITE);
        p.add(t);

        try{
            con c = new con();
            String departmentInfo = "select * from department";
            ResultSet resultSet = c.s.executeQuery(departmentInfo);
            t.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton b = new JButton("BACK");
        b.setBounds(400,410,120,30);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        p.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel l = new JLabel("Department");
        l.setBounds(145,11,105,20);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(l);

        JLabel l2 = new JLabel("Budget");
        l2.setBounds(431,11,105,20);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.BOLD,14));
        p.add(l2);



        setUndecorated(true);
        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new department();
    }
}
