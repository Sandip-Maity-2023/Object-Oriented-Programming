//package Oop Lab.Day 10;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
im


class hotel_manage extends JFrame{
    JTextField n,c;
    JTextField a1,a2;
    JButton sub;
    JComboBox<String>roomTypeBox;
Connection c1;
    hotel_manage(){
        setTitle("Hospital Management System");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6,2,10,10)); //used for setting the grid layout 
        //and 4 values are used for setting the gaps between the rows and columns
    connect();
    n=new JTextField();
    c=new JTextField();
    roomTypeBox=new JComboBox<>(new String[]{"Single","Double","Suite"});
a1=new JTextField("YYYY-MM-DD");
a2=new JTextField("YYYY-MM-DD");
sub=new JButton("Book Room");

sub.addActionListener(e->insertdata());
    add(new JLabel("Name:"));
    add(n);
    add(new JLabel("Contact:"));
    add(c);
    add(new JLabel("Room Type:"));
    add(roomTypeBox);
    add(new JLabel("Check-in Date:"));
    add(a1);
    add(new JLabel("Check-out Date:"));
    add(a2);
    add(sub);

        setVisible(true);
    }
    void insertdata(){
        String name=n.getText();
        String contact=c.getText();
        String roomType=(String)roomTypeBox.getSelectedItem();
        String checkInDate=a1.getText();
        String checkOutDate=a2.getText();

        String query="insert into booking(name,contact,room_type,check_in_date,check_out_date) values(?,?,?,?,?)";
        try {
            PreparedStatement ps=c1.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,contact);
            ps.setString(3,roomType);
            ps.setString(4,checkInDate);
            ps.setString(5,checkOutDate);
ps.executeUpdate();

JOptionPane.showMessageDialog(this,"Guest added successfully!");
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Failed to add guest!");
            ex.printStackTrace();
            }
        }
    
        void connect(){
        try {
            c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db","root","1234");
            System.out.println("Connected to database");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Database connection failed");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new hotel_manage();
    }
    
}
