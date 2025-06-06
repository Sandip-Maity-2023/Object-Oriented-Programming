package Practice;
// Required imports
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class exam extends JFrame {
    JTextField flightNumberField, airlineIdField, sourceField, destinationField, departureTimeField;
    JButton insertFlightButton;
    JTextArea outputArea;

    public exam() {
        setTitle("Aviation Management System");
        setSize(600, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Flight Number:"));
        flightNumberField = new JTextField(10);
        add(flightNumberField);

        add(new JLabel("Airline ID:"));
        airlineIdField = new JTextField(10);
        add(airlineIdField);

        add(new JLabel("Source:"));
        sourceField = new JTextField(10);
        add(sourceField);

        add(new JLabel("Destination:"));
        destinationField = new JTextField(10);
        add(destinationField);

        add(new JLabel("Departure Time (yyyy-mm-dd hh:mm:ss):"));
        departureTimeField = new JTextField(15);
        add(departureTimeField);

        insertFlightButton = new JButton("Insert Flight");
        add(insertFlightButton);

        outputArea = new JTextArea(10, 50);
        add(new JScrollPane(outputArea));

        insertFlightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertFlight();
            }
        });

        setVisible(true);
    }

    void insertFlight() {
        String flightNumber = flightNumberField.getText();
        int airlineId = Integer.parseInt(airlineIdField.getText());
        String source = sourceField.getText();
        String destination = destinationField.getText();
        String departureTime = departureTimeField.getText();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aviation", "root", "1234");
            String sql = "INSERT INTO flights (flight_number, airline_id, source, destination, departure_time) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, flightNumber);
            pst.setInt(2, airlineId);
            pst.setString(3, source);
            pst.setString(4, destination);
            pst.setString(5, departureTime);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                outputArea.setText("Flight inserted successfully!\n");
            }

            con.close();
        } catch (Exception ex) {
            outputArea.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AviationManagementSystem());
    }
}
