//Interfaces : It contains function prototypes with no Body.
import java.util.*;

//interface
interface i1{
    public void disp();
    public void print();
}
class C1 implements i1{
    public void disp(){
        System.out.println("\nInterface of disp()");
    }
    public void print(){
        System.out.println("\nInterface of print");
    }
    public void draw(){
        System.out.println("\nDraw not in Interface");
    }
}

public class P9_interfaces {
    public static void main(String args[]){
        C1 obj = new C1(); //creating an object "obj" of type C1 .
        obj.disp();
        obj.print();
        obj.draw(); //Here "obj.draw" will be printed and will not have any Error bcs the object "obj" is of type C1 . 
    }
    
}

/*OUTPUT :
E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P9_interfaces

Interface of disp()

Interface of print

Draw not in Interface
*/