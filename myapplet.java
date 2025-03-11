import java.applet.Applet;
import java.awt.*;

/*
 <applet code="MyApplet" width="400" height="400"></applet>
*/

public class myapplet extends Applet {
    
    // Applet initialization
    public void init() {
        System.out.println("Applet Initialized");
        setBackground(Color.WHITE);
    }

    // Called when the applet starts
    public void start() {
        System.out.println("Applet Started");
    }

    // Called when the applet stops
    public void stop() {
        System.out.println("Applet Stopped");
    }

    // Called when the applet is destroyed
    public void destroy() {
        System.out.println("Applet Destroyed");
    }

    // Paint method to draw shapes
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Hello, Applet!", 50, 50);

        g.setColor(Color.RED);
        g.drawLine(50, 70, 200, 70);

        g.setColor(Color.GREEN);
        g.drawRect(50, 90, 150, 100);

        g.setColor(Color.MAGENTA);
        g.drawOval(50, 210, 150, 100);
    }
    
}
