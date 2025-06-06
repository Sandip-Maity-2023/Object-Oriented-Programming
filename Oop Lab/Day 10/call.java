//package 'Oop Lab.Day 10';

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Practice.call;

public class call extends JFrame implements ActionListener {
    JTextField input;
    double num1, num2, result;
    char operator;

    public call() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        input = new JTextField();
        input.setEditable(false);
        input.setFont(new Font("Arial", Font.BOLD, 24));
        add(input, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') { //used to check if the button pressed is a number
            input.setText(input.getText() + cmd); //used to append the number to the text field
        } else if (cmd.equals("C")) {      //used to clear the text field
            input.setText("");
            num1 = num2 = result = 0;
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(input.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            input.setText("" + result);
        } else {
            operator = cmd.charAt(0); //used to get the operator pressed
            num1 = Double.parseDouble(input.getText());
            input.setText("");
        }
    }

    public static void main(String[] args) {
        new call();
    }
}
