package Hotel.src;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login2 extends JFrame implements ActionListener {
    JTextField t;
    JPasswordField p;
    JButton b1,b2;
    login2(){
        JLabel l = new JLabel("Username");
        l.setBounds(40,20,100,30);
        l.setFont(new Font("Tahoma",Font.BOLD,16));
        l.setForeground(Color.WHITE);
        add(l);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,16));
        l2.setForeground(Color.WHITE);
        add(l2);

        t = new JTextField();
        t.setBounds(150,20,150,30);
        t.setForeground(Color.WHITE);
        t.setFont(new Font("Tahoma", Font.PLAIN,15));
        t.setBackground(new Color(26,104,110));
        add(t);

        p = new JPasswordField();
        p.setBounds(150,70,150,30);
        p.setForeground(Color.WHITE);
        p.setBackground(new Color(26,104,110));
        add(p);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/login.gif"));
        Image i1 = i.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(i);
        label.setBounds(318,-30,255,300);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);


        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setLocation(400,270);
        setSize(600,300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            try {
                con1 c = new con1();
                String user = t.getText();
                String pass = p.getText();

                String q = "select * from login2 where user_name = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.s.executeQuery(q);
                if (resultSet.next()){
                    new admin();
                    setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid");
                }

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            new dashboard();
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new login2();
    }
}
