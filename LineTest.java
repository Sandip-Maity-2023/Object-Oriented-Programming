import java.awt.*;
import javax.swing.*;

public class LineTest extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //used for clearing the panel
        g.drawLine(50, 70, 200, 70); // visible
        g.drawLine(300, 300, 600, 300); // may NOT be visible depending on panel/frame size
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Demo");
        frame.setSize(5000, 300); // width = 400, height = 300
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new LineTest());
        frame.setVisible(true);
    }
}

