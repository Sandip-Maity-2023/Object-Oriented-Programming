package Hotel.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame implements ActionListener {
    JButton add,rec;
    dashboard(){
        super("Hotel Management System");

        rec=new JButton("RECEPTION");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Arial",Font.BOLD,15));
        rec.setBackground(new Color(255,98,10));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);


        add=new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Arial",Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/boss.png"));
        Image i2= i1.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(850,300,200,195);
        add(l);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/Reception.png"));
        Image i22 = im.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon z = new ImageIcon(i22);
        JLabel l2 = new JLabel(z);
        l2.setBounds(400,300,200,195);
        add(l2);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/Dashboard.gif"));
        Image i5=i4.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l1=new JLabel(i6);
        l1.setBounds(0,0,1950,1090);
        add(l1);

        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==rec){
            new reception();
           setVisible(false);
            }else{
             new login2();
           setVisible(false);
        }
    }
    public static void main(String[] args) {
        new dashboard();
    }
}
