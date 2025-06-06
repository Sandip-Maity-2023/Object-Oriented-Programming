package Practice;
// Required imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AviationManagementSystem extends JFrame {
    JTextField flightNumberField, airlineIdField, sourceField, destinationField, departureTimeField;
    JButton insertFlightButton;
    JTextArea outputArea;

    public AviationManagementSystem() {
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
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aviation", "root", "password");
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
//
//// Part 2: Abstract class with polymorphism\abstract class Employee {
//    String name;
//
//double getBonus() {
//    return 0;
//}
//}
//
//class Manager extends Employee {
//    public Manager(String name) {
//        this.name = name;
//    }
//
//    double getBonus() {
//        return 10000.0;
//    }
//}
//
//class Developer extends Employee {
//    public Developer(String name) {
//        this.name = name;
//    }
//
//    double getBonus() {
//        return 5000.0;
//    }
//}
//
//class PolymorphismDemo {
//    public static void main(String[] args) {
//        Employee[] employees = new Employee[4];
//        employees[0] = new Manager("Alice");
//        employees[1] = new Developer("Bob");
//        employees[2] = new Manager("Carol");
//        employees[3] = new Developer("David");
//
//        for (Employee emp : employees) {
//            System.out.println(emp.name + "'s bonus: " + emp.getBonus());
//        }
//    }
//}
//
//public void main() {
//}