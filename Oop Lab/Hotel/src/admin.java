package Hotel.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {

    JButton add_e, add_r, add_d, logout, back;
    admin(){

        add_e = new JButton( "ADD EMPLOYEE");
        add_e.setBounds(250,230,200,30);
        add_e.setBackground(Color.WHITE);
        add_e.setForeground(Color.BLACK);
        add_e.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_e.addActionListener(this);
        add(add_e);

        add_r = new JButton( "ADD ROOM");
        add_r.setBounds(250,380,200,30);
        add_r.setBackground(Color.WHITE);
        add_r.setForeground(Color.BLACK);
        add_r.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_r.addActionListener(this);
        add(add_r);

        add_d = new JButton( "ADD DRIVERS");
        add_d.setBounds(250,530,200,30);
        add_d.setBackground(Color.WHITE);
        add_d.setForeground(Color.BLACK);
        add_d.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_d.addActionListener(this);
        add(add_d);

        logout = new JButton( "Logout");
        logout.setBounds(10,800,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton( "Back");
        back.setBounds(110,800,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);


        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/room.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/driver.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/login.gif"));
        Image image2 = imageIcon3.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon13 = new ImageIcon(image2);
        JLabel label3 = new JLabel(imageIcon13);
        label3.setBounds(1000,250,400,400);
        add(label3);


        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_e){
            new addEmployee();
        } else if (e.getSource() == add_r) {
            new addRoom();
        } else if (e.getSource() ==  add_d) {
            new addDriver();
        } else if (e.getSource() == logout){
            System.exit(102);
        } else if (e.getSource() == back) {
            new dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new admin();
    }
}
