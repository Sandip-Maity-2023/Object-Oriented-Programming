package Hotel.src;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class customerInfo extends JFrame {
    customerInfo(){

        JPanel p = new JPanel();
        p.setBounds(5,5,890,590);
        p.setBackground(new Color(3,45,48));
        p.setLayout(null);
        add(p);

        JTable t = new JTable();
        t.setBounds(10,40,900,450);
        t.setBackground(new Color(3,45,48));
        t.setForeground(Color.WHITE);
        p.add(t);

        try {

            con c = new con();
            String q = "select * from Customer";
            ResultSet resultSet = c.s.executeQuery(q);
            t.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e ){
            e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(31,11,100,14);
        id.setForeground(Color.WHITE);
        id.setFont( new Font("Tahoma", Font.BOLD,14));
        p.add(id);

        JLabel n = new JLabel("Number");
        n.setBounds(150,11,100,14);
        n.setForeground(Color.WHITE);
        n.setFont( new Font("Tahoma", Font.BOLD,14));
        p.add(n);

        JLabel n1 = new JLabel("Name");
        n1.setBounds(270,11,100,14);
        n1.setForeground(Color.WHITE);
        n1.setFont( new Font("Tahoma", Font.BOLD,14));
        p.add(n);

        JLabel g = new JLabel("Gender");
        g.setBounds(360,11,100,14);
        g.setForeground(Color.WHITE);
        g.setFont( new Font("Tahoma", Font.BOLD,14));
        p.add(g);

        JLabel c1 = new JLabel("Country");
        c1.setBounds(480,11,100,25);
        c1.setForeground(Color.WHITE);
        c1.setFont( new Font("Tahoma", Font.BOLD,14));
        p.add(c1);

        JLabel r = new JLabel("Room");
        r.setBounds(600,11,100,14);
        r.setForeground(Color.WHITE);
        r.setFont( new Font("Tahoma", Font.BOLD,14));
        p.add(r);

        JLabel t1 = new JLabel("CI Time");
        t1.setBounds(680,11,100,14);
        t1.setForeground(Color.WHITE);
        t1.setFont( new Font("Tahoma", Font.BOLD,14));
        p.add(t1);

        JLabel d = new JLabel("Deposit");
        d.setBounds(800,11,100,25);
        d.setForeground(Color.WHITE);
        d.setFont( new Font("Tahoma", Font.BOLD,14));
        p.add(d);

        JButton b = new JButton("Back");
        b.setBounds(450,510,120,30);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        p.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new customerInfo();
    }
}
