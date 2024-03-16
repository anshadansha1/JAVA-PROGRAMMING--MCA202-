//PROGRAM : AWT simple program

/*DELEGATION MODEL--> 
1)Source  
2)Event
3)Listener 

Button -> ActionEvent -> ActionListener

 */
import java.io.*;
import java.awt.*;
import java.awt.event.*;

 public class P73_awt1 {
    public static void main(String args[]){
        Frame obj = new Frame("Test......"); //creates a new frame window with the title "Test......"
        obj.setSize(500,500);  //sets the size of the Frame
        obj.setVisible(true); //if true :frame will become visible on the screen
    }
}
