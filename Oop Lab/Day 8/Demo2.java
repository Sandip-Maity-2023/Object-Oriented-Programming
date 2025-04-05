import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Demo2 {
    // main function
    public static void main(String[] args)
    {
        // Creating instance of frame with the label
        Frame frame = new Frame("Example 2");

        // Creating instance of button with label
        Button button = new Button("Click Here");

        // Setting the position for the button in frame
        button.setBounds(80, 100, 64, 30);

        // Adding button to the frame
        frame.add(button);

        // setting size, layout and visibility of frame
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Using WindowListener for closing the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}