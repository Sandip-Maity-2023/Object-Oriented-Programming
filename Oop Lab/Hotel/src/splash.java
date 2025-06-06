package Hotel.src;
import javax.swing.*;

public class splash extends JFrame {
    splash(){
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("Hotel/icon/splash.gif"));
        JLabel l=new JLabel(i); //jlabel is a component which lets you display unselectable text and images
        l.setBounds(0,0,800,650);
        add(l);

        setLayout(null); //layout refers to how components like buttons, labels, or panels are arranged within a container (such as a JFrame or JPanel).
        setLocation(300,80);
        setSize(800,650);
        setVisible(true);
        try{
            Thread.sleep(3000);
            new login();
            setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new splash();
    }
    
}
