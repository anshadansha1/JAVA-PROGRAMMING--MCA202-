
//PROGRAM : Implementation of Multiple Interfaces in JAVA.
// NOTE: [..JAVA doesnt support multiple Inheritance].But multiple interfaces can be implemented.

import java.util.*;

interface i1 { // interface 1
    void disp();
}

interface i2 { // interface 2
    void print();
}

class Cm1 implements i1, i2 { // implementation of multiple interfaces.
    public void disp() {
        System.out.println("\nIn disp i1");
    }

    public void print() {
        System.out.println("\nIn print i2");
    }
}

public class P16_multiple_interfaces {
    public static void main(String args[]) {
        Cm1 obj = new Cm1();
        obj.disp();
        obj.print();
    }

}
// NOTE: [One class can implement only one Base class but can implement more than one interfaces. ]
/*
interface shape{
    disp();
}
class point{
    int x,y;
}
class circle extends point implements shape{
    int r;
}

*/

/*
 * OUTPUT:
 * E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P16_multiple_interfaces
 * 
 * In disp i1
 * 
 * In print i2
 */