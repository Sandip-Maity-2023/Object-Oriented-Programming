import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class hello extends Applet {
    public void paint(Graphics g) {
        g.drawRect(100, 100, 300, 300);
        g.drawString("hello",230,250);

        
    }
}
