import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.Border;

public class ExSwingJDBC2 {
    public static void main(String[] args) {
        //create Frame instance
        JFrame f = new JFrame("Fetch Data from Database");
        JTextArea t=new JTextArea(20,30);
        t.setEditable(false);

        JScrollPane s=new JScrollPane(t);
        f.add(s);
        JButton b=new JButton();
        f.add(b,BorderLayout.SOUTH);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to fetch data from database and display in JTextArea
  try {
      Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "1234");

      String sql="select * from student";
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery(sql);

        t.setText("");
        while(rs.next()){
            int id=rs.getInt("id");
            t.append("ID: "+id+"\n");
            String name=rs.getString("name");
            t.append("Name: "+name+"\n");
        }
  } catch (SQLException ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(f, "SQL Error: " + ex.getMessage());
  } catch (Exception ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(f, "Database Error: " + ex.getMessage());
  }
                            }
                        });
                        f.setSize(400, 300);
                        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        f.setVisible(true);
                    }
                }