//PROGRAM : create an interface called ishape having two prototypes: draw() and move().
//create two classes :Line and Circle which implements the above interface.  
import java.io.*;
interface ishape{
    public void draw();
    public void move();
}
class Line implements ishape{
    public void draw(){
        System.out.println("\nLine draw");
    }
    public void move(){
        System.out.println("\nLine move");
    }
}

class Circle implements ishape{
    public void draw(){
        System.out.println("\nCircle draw");
    }
    public void move(){
        System.out.println("\nCircle move");
    }
}
public class P12_interfaces4 {
    public static void main(String args[]){
        ishape obj; //here same object "obj" is used for both classes.
        obj = new Line();
        obj.draw();
        obj.move();

        obj = new Circle();
        obj.draw();
        obj.move();
    }    
}

/*OUTPUT:
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P12_interfaces4

Line draw

Line move

Circle draw

Circle move
 */