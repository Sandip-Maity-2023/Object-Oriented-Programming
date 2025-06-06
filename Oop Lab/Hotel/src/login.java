package Hotel.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JTextField t=new JTextField();
    JPasswordField p;
    JButton b1,b2;

    login(){
        JLabel l1=new JLabel("Username:");
        l1.setBounds(40,20,100,30);
        l1.setFont(new Font("Times New Roman",Font.BOLD,16));
        l1.setForeground(Color.white);
        add(l1);

        JLabel l2=new JLabel("Password:");
        l2.setBounds(40,70,100,30);
        l2.setFont(new Font("Times New Roman",Font.BOLD,16));
        l2.setForeground(Color.white);
        add(l2);

        t.setBounds(150,20,150,30);
        t.setForeground(Color.cyan);
        t.setFont(new Font("Tahoma",Font.BOLD,15));
        t.setBackground(new Color(26,104,110));
        add(t);

        p=new JPasswordField();
        p.setBounds(150,70,150,30);
        p.setForeground(Color.WHITE);
        p.setBackground(new Color(26,104,110));
        add(p);

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/anime.gif"));
        Image img=i.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT); //This is often used in GUI (Graphical User Interface) development in Java to ensure images fit properly in a specific component or space.
        ImageIcon re=new ImageIcon(img);
        JLabel l3=new JLabel(re);
        l3.setBounds(318,-30,255,350);
        add(l3);

        b1=new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("Serif",Font.BOLD,18));

        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("Serif",Font.BOLD,15));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this); //The keyword refers to the current instance of the class where this code exists. It implies that this class implements the ActionListener interface.
        add(b2);

        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(600,300);
        setVisible(true);
        add(b1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try{
                con1 c=new con1();
                String user=t.getText();
                String pass=p.getText();
                String q="select * from login where username='"+user+"' and password='"+pass+"'";
                ResultSet r=c.s.executeQuery(q);
                if(r.next()){
                    new dashboard();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                }
            }catch(Exception E){
                E.printStackTrace();
            }
        }else{
            System.exit(102);
        }
    }
    public static void main(String[] args) {
        new login();
    }
}
