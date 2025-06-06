package Hotel.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivilegedExceptionAction;

public class reception extends JFrame {
    reception(){
        JPanel p=new JPanel();
        p.setLayout(null);
        p.setBounds(280,5,1238,48);
        add(p);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(5,5,270,820);
        p1.setBackground(new Color(3,45,48));
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/cccc.gif"));
        Image i2=i1.getImage().getScaledInstance(800,800,Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(300,20,800,800);
        p1.add(l1);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/login.gif"));
        Image i5=i4.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(5,530,250,250);
        p1.add(l2);

        JButton b=new JButton("New Customer Form");
        b.setBounds(30,30,200,30);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        p1.add(b);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                   new newCustomer();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b1=new JButton("Room");
        b1.setBounds(30,70,200,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new room();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b2=new JButton("Department");
        b2.setBounds(30,110,200,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        p1.add(b2);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new department();

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b3=new JButton("All Employee info");
        b3.setBounds(30,150,200,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        p1.add(b3);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new employee();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b4=new JButton("Customer info");
        b4.setBounds(30,190,200,30);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        p1.add(b4);
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new customerInfo();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b5=new JButton("Manager Info");
        b5.setBounds(30,230,200,30);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        p1.add(b5);
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new managerInfo();
                }catch(Exception e){
                    e.printStackTrace();

                }
            }
        });

        JButton b6=new JButton("Check Out");
        b6.setBounds(30,270,200,30);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        p1.add(b6);
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new checkout();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b7=new JButton("Update Check In Details");
        b7.setBounds(30,310,200,30);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        p1.add(b7);
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new updateCheck();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b8=new JButton("Update Room Status");
        b8.setBounds(30,350,200,30);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        p1.add(b8);
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new updateRoom();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b9=new JButton("Pick Up Service");
        b9.setBounds(30,390,200,30);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        p1.add(b9);
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                   new pickUp();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b10=new JButton("Search Room");
        b10.setBounds(30,430,200,30);
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        p1.add(b10);
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    new searchRoom();

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b11=new JButton("Logout");
        b11.setBounds(30,470,95,30);
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        p1.add(b11);
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    System.exit(500);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton b12=new JButton("Back");
        b12.setBounds(140,470,95,30);
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        p1.add(b12);
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                try{
                    setVisible(false);
                    new dashboard();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    public static void main(String args[]){
        new reception();
    }
}
