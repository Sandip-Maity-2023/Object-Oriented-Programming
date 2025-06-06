import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RegFormSmall extends JFrame implements ActionListener {
    JTextField n, e, p, d; JPasswordField pw, cpw; JTextArea a; JRadioButton m, f, o; JButton r, rs; ButtonGroup g;
    static final String URL = "jdbc:mysql://localhost:3306/mydb"; static final String USER = "user"; static final String PASS = "password";

    public RegFormSmall() {
        setTitle("Reg"); setSize(300, 400); setDefaultCloseOperation(EXIT_ON_CLOSE); setLayout(new GridLayout(8, 2, 5, 5));
        add(new JLabel("Name:")); add(n = new JTextField());
        add(new JLabel("Email:")); add(e = new JTextField());
        add(new JLabel("Phone:")); add(p = new JTextField());
        add(new JLabel("Pass:")); add(pw = new JPasswordField());
        add(new JLabel("Confirm:")); add(cpw = new JPasswordField());
        add(new JLabel("Gender:")); JPanel gp = new JPanel(new FlowLayout(FlowLayout.LEFT));
        gp.add(m = new JRadioButton("Male")); gp.add(f = new JRadioButton("Female")); gp.add(o = new JRadioButton("Other"));
        add(gp); g = new ButtonGroup(); g.add(m); g.add(f); g.add(o);
        add(new JLabel("DOB:")); add(d = new JTextField());
        add(new JLabel("Address:")); add(new JScrollPane(a = new JTextArea(2, 15)));
        add(r = new JButton("Reg")); add(rs = new JButton("Reset")); r.addActionListener(this); rs.addActionListener(this);
        setLocationRelativeTo(null); setVisible(true);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == r) register(); else if (ev.getSource() == rs) clear();
    }

    void register() {
        String name = n.getText(), email = e.getText(), phone = p.getText(), pass = new String(pw.getPassword()), cpass = new String(cpw.getPassword()),
               gender = m.isSelected() ? "Male" : (f.isSelected() ? "Female" : "Other"), dob = d.getText(), addr = a.getText();
        if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || !pass.equals(cpass)) {
            JOptionPane.showMessageDialog(this, "Fill all and match pass.", JOptionPane.ERROR_MESSAGE); return;
        }
        try (Connection c = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = c.prepareStatement("INSERT INTO users (name, email, phone, password, gender, dob, address) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            ps.setString(1, name); ps.setString(2, email); ps.setString(3, phone); ps.setString(4, pass); ps.setString(5, gender); ps.setString(6, dob); ps.setString(7, addr);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Registered!", JOptionPane.INFORMATION_MESSAGE); clear();
            } else JOptionPane.showMessageDialog(this, "Failed.", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) { JOptionPane.showMessageDialog(this, "DB Error: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE); ex.printStackTrace(); }
    }

    void clear() { n.setText(""); e.setText(""); p.setText(""); pw.setText(""); cpw.setText(""); g.clearSelection(); d.setText(""); a.setText(""); }

    public static void main(String[] args) { SwingUtilities.invokeLater(RegFormSmall::new); }
}