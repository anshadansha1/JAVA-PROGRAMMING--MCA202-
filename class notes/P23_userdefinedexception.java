//PROGRAM : User Defined exception : 4)throw
//Create a class which is inherited from Exception.

import java.util.*;

class MyEx extends Exception { // class "MyEx" is inherited from Exception
    String strError;

    public MyEx(String s) { // constructor
        super();
        strError = s;
    }

    public void disp() {
        System.out.println("Error : " + strError);
    }
}

public class P23_userdefinedexception {
    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("\nEnter two numbers : ");
            a = s.nextInt();
            b = s.nextInt();
            s.close();
            if (b == 0) {
                throw new MyEx("Denominator is Zero ,NOT possible"); //throwing exception when denominator becomes zero.
            }
            c = a / b;
            System.out.println("\n c = " + c);
            
        }
        //User defined exception 
        catch (MyEx m) {
            m.disp(); // invoking disp of class "MyEx".
        }
         catch (Exception e) {
            System.out.println("\nError : " + e);
        }
        
    }
}

/*
 OUTPUT : 
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P23_userdefinedexception

Enter two numbers :
6
3

 c = 2
 */