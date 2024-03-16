//PROGRAM : AWT ->TextField:
//  1)getText()
//  2)setText()
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class CTF extends Frame implements ActionListener{
    Button b1,b2;
    TextField t1,t2;
    public CTF(){
        super("TextField Demo.........");
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("Move");
        b2 = new Button("Exit");

        setLayout(new FlowLayout()); //setting layout
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String str = t1.getText(); // storing string in TextField1 to str;
            t1.setText("");
            t2.setText(str); //string in TextField1 is moved to TextField2.
        }
        else if(ae.getSource() == b2){
            System.exit(0);
        }
    }
}
public class P76_awt4_textfield {
    public static void main(String args[]){
        CTF obj = new CTF();
    }
}
