//PROGRAM :An interface can invoke other methods present in the class.
import java.util.*;
interface i1{
    public void disp();
    public void print();
}

class C2 implements i1{
    public void disp(){
        System.out.println("\nInterface of disp");
    }
    public void print(){
        draw();// invoking other method present in class. 
        System.out.println("\nInterface of print");
    }
    public void draw(){
        System.out.println("\nDraw Not in Interface ");
    }
}

public class P11_interfaces3 {
    public static void main(String args[]){
        i1 obj = new C2();
        obj.disp();
        obj.print();
        //obj.draw();
    }
}

/*OUTPUT:
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P11_interfaces3

Interface of disp

Draw Not in Interface

Interface of print
 */
