//PROGRAM : AWT Layouts -->
/*
1)FlowLayout() :one after another
2)GridLayout() : in the form of rows and columns
3)CardLayout() : 
4)BorderLayout() : controls in layout
*/
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class CBD extends Frame implements ActionListener{
    Button b1,b2,b3;
    public CBD(){
        super("Button Demo......");
        //Defining Buttons
        b1 = new Button("OK");
        b2 = new Button("Cancel");
        b3 = new Button("Exit");
        //setting layout
        setLayout(new FlowLayout());
        //Adding buttons to Frame
        add(b1);
        add(b2);
        add(b3); 
        b1.addActionListener(this); 
        //When b1 is clicked, the actionPerformed(ActionEvent ae) method defined in the CBD class will be invoked to handle the action event.
        b2.addActionListener(this);
        b3.addActionListener(this);
        setSize(700,700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            System.out.println("\nButton is pressed...OK");
        }
        else if(ae.getSource() == b2){
            System.out.println("\nButton is pressed...Cancel");
        }
        else{
            System.exit(0);
        }
    }
}
public class P75_awt3_layouts {
    public static void main(String args[]){
        CBD obj = new CBD();
    }
}

/* OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P75_awt3_layouts

Button is pressed...OK

Button is pressed...OK

Button is pressed...OK

Button is pressed...OK

Button is pressed...Cancel

Button is pressed...Cancel

Button is pressed...Cancel
 */