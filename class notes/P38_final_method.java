
//PROGRAM : "Final Method":Once you declare a method as Final,it Cannot be overridden.
import java.io.*;

class CBase {
    public final void disp() { // Final method
        System.out.println("\nFinal Method in the base class.");
    }

    public void show() {
        System.out.println("Show method in the base class.");
    }
}

class CDerived extends CBase {
    public void show() {
        super.show();
        System.out.println("\nShow method in the Derived Class.");

    }
    // public void disp(){} : Overriding final method
}

public class P38_final_method {
    public static void main(String args[]) {
        CDerived obj = new CDerived();
        obj.disp();
        obj.show();
    }

}

/*
 * OUTPUT:
 * E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P38_final_method
 * 
 * Final Method in the base class.
 * Show method in the base class.
 * 
 * Show method in the Derived Class.
 */