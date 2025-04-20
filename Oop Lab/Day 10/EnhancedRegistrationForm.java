import java.awt.*;
import javax.swing.*;

public class EnhancedRegistrationForm extends JFrame {

    JTextField nameField, emailField;
    JPasswordField passwordField;
    JTextArea addressArea;
    JRadioButton maleRadio, femaleRadio, otherRadio;
    JCheckBox readingBox, musicBox, travelBox;
    JComboBox<String> countryBox;
    JButton submitButton, resetButton;
    JToggleButton toggleTerms; // Button to toggle terms agreement

    public EnhancedRegistrationForm() {
        setTitle("Enhanced Registration Form");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(11, 2, 5, 5));

        // Components
        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        addressArea = new JTextArea(3, 20);
        JScrollPane addressScroll = new JScrollPane(addressArea);

        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        otherRadio = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);

        readingBox = new JCheckBox("Reading");
        musicBox = new JCheckBox("Music");
        travelBox = new JCheckBox("Traveling");

        String[] countries = {"India", "USA", "UK", "Canada", "Other"};
        countryBox = new JComboBox<>(countries);

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        toggleTerms = new JToggleButton("Agree to Terms");

        // Action Listener
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String gender = maleRadio.isSelected() ? "Male" : femaleRadio.isSelected() ? "Female" : "Other";

            StringBuilder hobbies = new StringBuilder();
            if (readingBox.isSelected()) hobbies.append("Reading ");
            if (musicBox.isSelected()) hobbies.append("Music ");
            if (travelBox.isSelected()) hobbies.append("Traveling ");

            String country = (String) countryBox.getSelectedItem();
            String address = addressArea.getText();

            if (toggleTerms.isSelected()) {
                JOptionPane.showMessageDialog(this,
                        "Registration Successful!\n\n" +
                                "Name: " + name + "\nEmail: " + email +
                                "\nGender: " + gender +
                                "\nHobbies: " + hobbies +
                                "\nCountry: " + country +
                                "\nAddress: " + address);
            } else {
                JOptionPane.showMessageDialog(this, "Please agree to the terms.");
            }
        });

        resetButton.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            addressArea.setText("");
            genderGroup.clearSelection();
            readingBox.setSelected(false);
            musicBox.setSelected(false);
            travelBox.setSelected(false);
            countryBox.setSelectedIndex(0);
            toggleTerms.setSelected(false);
        });

        // Layout setup
        add(new JLabel("Name:")); add(nameField);
        add(new JLabel("Email:")); add(emailField);
        add(new JLabel("Password:")); add(passwordField);
        add(new JLabel("Gender:"));

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);
        add(genderPanel);

        add(new JLabel("Hobbies:"));
        JPanel hobbiesPanel = new JPanel();
        hobbiesPanel.add(readingBox);
        hobbiesPanel.add(musicBox);
        hobbiesPanel.add(travelBox);
        add(hobbiesPanel);

        add(new JLabel("Country:")); add(countryBox);
        add(new JLabel("Address:")); add(addressScroll);
        add(new JLabel("Terms:")); add(toggleTerms);
        add(submitButton); add(resetButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new EnhancedRegistrationForm();
    }
}
