package Hotel.src;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class pickUp extends JFrame {
    pickUp(){

        JPanel p = new JPanel();
        p.setBackground(new Color(3,45,48));
        p.setBounds(5,5,790,590);
        p.setLayout(null);
        add(p);

        JLabel p1 = new JLabel("Pick Up Service");
        p1.setBounds(90,11,160,25);
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("Tahoma", Font.BOLD, 20));
        p.add(p1);

        JLabel l = new JLabel("Type of Car");
        l.setBounds(32,97,89,14);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(l);

        Choice c = new Choice();
        c.setBounds(123,94,150,25);
        p.add(c);

        try{
            con C = new con();
            ResultSet resultSet = C.s.executeQuery("select * from driver");
            while (resultSet.next()){
                c.add(resultSet.getString("carname"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JTable t = new JTable();
        t.setBounds(10,233,800,250);
        t.setBackground(new Color(3,45,48));
        t.setForeground(Color.WHITE);
        p.add(t);

        try{
            con C = new con();
            String q = "select * from driver";
            ResultSet resultSet = C.s.executeQuery(q);
            t.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel l1 = new JLabel("Name");
        l1.setBounds(24,208,46,14);
        l1.setForeground(Color.WHITE);
        p.add(l1);

        JLabel a = new JLabel("Age");
        a.setBounds(165,208,46,14);
        a.setForeground(Color.WHITE);
        p.add(a);

        JLabel g = new JLabel("Gender");
        g.setBounds(264,208,46,14);
        g.setForeground(Color.WHITE);
        p.add(g);

        JLabel com = new JLabel("Company");
        com.setBounds(366,208,100,14);
        com.setForeground(Color.WHITE);
        p.add(com);

        JLabel car = new JLabel("Car Name");
        car.setBounds(486,208,100,14);
        car.setForeground(Color.WHITE);
        p.add(car);

        JLabel a1 = new JLabel("Available");
        a1.setBounds(600,208,100,14);
        a1.setForeground(Color.WHITE);
        p.add(a1);

        JLabel l2 = new JLabel("Loacation");
        l2.setBounds(700,208,100,14);
        l2.setForeground(Color.WHITE);
        p.add(l2);

        JButton d = new JButton("Display");
        d.setBounds(200,500,120,30);
        d.setBackground(Color.BLACK);
        d.setForeground(Color.WHITE);
        p.add(d);
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from driver where carname = '"+c.getSelectedItem()+"'";
                try{
                    con c = new con();
                    ResultSet resultSet = c.s.executeQuery(q);
                    t.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });



        JButton b = new JButton("Back");
        b.setBounds(420,500,120,30);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        p.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setLayout(null);
        setSize(800,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new pickUp();
    }
}
