import java.awt.*;
import java.awt.event.*;
public class Demo3 {
        
    public static void main(String[] args) {
        Frame frame = new Frame("Menu Example");
        MenuBar menuBar = new MenuBar();
        frame.setMenuBar(menuBar);

        
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
              
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
