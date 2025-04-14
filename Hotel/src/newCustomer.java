package Hotel.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class newCustomer extends JFrame implements ActionListener {
    JComboBox box;
    JTextField t,t1, TextCountry,TextDeposite;
    JRadioButton r1, r2;
    Choice c1;
    JLabel date;

    JButton add,back;
    newCustomer(){

        JPanel p = new JPanel();
        p.setBounds(5,5,840,540);
        p.setLayout(null);
        p.setBackground(new Color(3,45,48));
        add(p);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/customer.png"));
        Image img = i.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i1 = new ImageIcon(img);
        JLabel i3 = new JLabel(i1);
        i3.setBounds(550,150,200,200);
        p.add(i3);

        JLabel labelName = new JLabel("NEW CUSTOMER FORM");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma", Font.BOLD,20));
        labelName.setForeground(Color.WHITE);
        p.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,76,200,14);
        labelID.setForeground(Color.WHITE);
        labelID.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(labelID);

        box = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving License"});
        box.setBounds(271,73,150,20);
        box.setBackground(new Color(3,45,48));
        box.setForeground(Color.WHITE);
        box.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(box);

        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,111,200,14);
        labelNumber.setForeground(Color.WHITE);
        labelNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(labelNumber);
        t = new JTextField();
        t.setBounds(271,111,150,20);
        p.add(t);

        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(35,151,200,14);
        labelname.setForeground(Color.WHITE);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(labelname);
        t1 = new JTextField();
        t1.setBounds(271,151,150,20);
        p.add(t1);


        JLabel labelGender = new JLabel("Gender :");
        labelGender.setBounds(35,191,200,14);
        labelGender.setForeground(Color.WHITE);
        labelGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(3,45,48));
        r1.setBounds(271,191,80,12);
        p.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(3,45,48));
        r2.setBounds(350,191,80,12);
        p.add(r2);

        JLabel labelCountry = new JLabel("Country :");
        labelCountry.setBounds(35,231,200,14);
        labelCountry.setForeground(Color.WHITE);
        labelCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(labelCountry);
        TextCountry = new JTextField();
        TextCountry.setBounds(271,231,150,20);
        p.add(TextCountry);


        JLabel labelRoom = new JLabel("Allocated Room Number :");
        labelRoom.setBounds(35,274,200,14);
        labelRoom.setForeground(Color.WHITE);
        labelRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(labelRoom);

        c1 = new Choice();
        try{

            con c = new con();
            ResultSet resultSet = c.s.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma", Font.BOLD, 14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3,45,48));
        p.add(c1);

        JLabel labelCIS = new JLabel("Checked-In :");
        labelCIS.setBounds(35,316,200,14);
        labelCIS.setForeground(Color.WHITE);
        labelCIS.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(labelCIS);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(271,316,200,14);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(date);


        JLabel labelDeposite = new JLabel("Deposite :");
        labelDeposite.setBounds(35,359,200,14);
        labelDeposite.setForeground(Color.WHITE);
        labelDeposite.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(labelDeposite);
        TextDeposite = new JTextField();
        TextDeposite.setBounds(271,359,150,20);
        p.add(TextDeposite);

        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        p.add(add);

        back = new JButton("BACK");
        back.setBounds(260,430,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        p.add(back);

        setLayout(null);
        setLocation(500,150);
        setSize(850,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            con c = new con();
            String radioBTn = null;
            if (r1.isSelected()){
                radioBTn = "Male";
            } else if (r2.isSelected()) {
                radioBTn = "Female";
            }

            String s1 = (String)box.getSelectedItem();
            String s2 =  t.getText();
            String s3 =  t1.getText();
            String s4 =  radioBTn;
            String s5 =  TextCountry.getText();
            String s6 =  c1.getSelectedItem();
            String s7 =  date.getText();
            String s8 = TextDeposite.getText();

            try {

                String q ="insert into customer values ('"+s1+"', '"+s2+"','"+s3+"','"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"', '"+s8+"')";
                String q1 = "update room set availability = 'Occupied' where roomnumber = "+s6;
                c.s.executeUpdate(q);
                c.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "added Successfully");
                setVisible(false);

            }catch (Exception E) {
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new newCustomer();
    }
}