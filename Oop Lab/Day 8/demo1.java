import java.awt.*;
import java.awt.event.*;

public class Demo1 {
    public static void main(String args[]) {
        Frame f = new Frame("hello");
        Label l = new Label("world");
        l.setAlignment(Label.CENTER);
        f.add(l);
        f.setSize(500, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }

        });
    }
}