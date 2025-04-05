import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame {
    public RegistrationForm() {
        JFrame f = new JFrame("Registration Form");
        f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b = new JButton("Enter Name");
        b.setBounds(60,50,150,150);

f.setVisible(true);
b.setVisible(true);
f.add(b);
f.add(b);

    }
    public static void main(String[] args) {
        new RegistrationForm();
    }
}