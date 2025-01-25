import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Nptel_Applet extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawString("Welcome to NPTEL Java Week 12", 300, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nptel Applet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
