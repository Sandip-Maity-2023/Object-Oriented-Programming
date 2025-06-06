package Practice;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class call extends JFrame implements ActionListener{
    JTextField t;
String s;
double n1,n2,r;
    call(){
        setTitle("Calculator");
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        t=new JTextField();
        t.setFont(new Font("Arial",Font.BOLD,30));
        t.setEditable(false);
        add(t,BorderLayout.NORTH);

        JPanel p=new JPanel(new GridLayout(4,4,10,10));
        String[] bn={
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+"
        };
        for(String text:bn){
            JButton b=new JButton(text);
            b.setFont(new Font("Calibri",Font.BOLD,20));
            b.addActionListener(this);
            p.add(b);
        }
        add(p,BorderLayout.CENTER);
        }
    public void actionPerformed(ActionEvent e){
    String input=e.getActionCommand();
if(input.charAt(0)>='0' && input.charAt(0)<='9'){
    t.setText(t.getText()+input);
}else if(input.equals("C")){
    t.setText("");
    n1=n2=r=0;
    s="";
}else if(input.equals("=")){
    try {
        n2=Double.parseDouble(t.getText());
        switch(s){
            case "+":r=n1+n2;break;
            case "-":r=n1-n2;break;
            case "*":r=n1*n2;break;
            case "/":r=n2 !=0 ?n1/n2:0;break;
        }
        t.setText(""+r);
    } catch (Exception ex) {
        t.setText("Error");
    }
}else{
    try{
        n1=Double.parseDouble(t.getText());
        s=input;
        t.setText("");
    }catch(Exception ex){
        t.setText("Error");
    }
}
}

    public static void main(String[] args) {
        call x=new call();
        x.setVisible(true);
    }
}

