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

public class P10_interfaces2 {
    public static void main(String args[]){
        i1 obj = new C1(); //creating an object "obj" of type i1 .
        obj.disp();
        obj.print();
        //obj.draw(); //Here we cannot directly call "obj.draw"  because it is not defined in interface. 
        
    }
    
}

/*OUTPUT :
E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P10_interfaces2

Interface of disp()

Interface of print

*/