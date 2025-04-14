import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class hello {

    public static void main(String[] args) {
        
        JFrame f = new JFrame("Fetch Data from Database");
        
        
        JTextArea t = new JTextArea(50, 40);
        t.setEditable(true);  
        JScrollPane s = new JScrollPane(t);  
        f.add(s);

        
        JButton b = new JButton("Fetch Data");
        f.add(b, BorderLayout.SOUTH);  

        
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                try {
                    
                    Connection c = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/college", "root", "1234"); 
                    
                    // SQL query to fetch data from the table
                    String s = "SELECT * FROM java";
                    Statement st = c.createStatement();
                    ResultSet r = st.executeQuery(s);
                    
                    // Clear any previous data in the JTextArea
                    t.setText("");
                    
                    // Loop through the result set and append the data to the JTextArea
                    while (r.next()) {
                        int id = r.getInt("id");
                        String name = r.getString("name");
                        t.append("ID: " + id + " Name: " + name + "\n");
                    }

                    // Close the connection
                    c.close();
                } catch (SQLException x) {
                    x.printStackTrace();
                    JOptionPane.showMessageDialog(f, "Database error: " + x.getMessage());
                }
            }
        });

        // Set up JFrame properties
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}