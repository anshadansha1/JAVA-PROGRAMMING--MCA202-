//PROGRAM : AWT

import java.io.*;
import java.awt.*;
import java.awt.event.*;

class CFrame extends Frame{ //inheriting built in class 'Frame'
    public CFrame(){
        super("Testing......"); //Passing value to Base class constructor.
        //Exit Button code:
        this.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent){ 
                setVisible(false);
                System.exit(0); 
           } 
        });

        setSize(500,500);
        setVisible(true);
    }
}

public class P74_awt2{
    public static void main(String args[]){
        CFrame obj = new CFrame();
    }
}
