/*PROGRAM 6_2: Create an interface Shape having two prototypes disp() and calc(), to diplay the shape and calculate volume respectively.
 Create two classes circle and rectangle which implements the above interface. 
In the main function create a reference of Shape depending on the user-choice.*/
import java.util.*;

interface Shape{
    public void disp();
    public double calc();
}
class Circle implements Shape{
    double r;
    //constructor
    public Circle(double r){
        this.r = r;
    }
    public void disp(){
        System.out.println("\nThis is a Circle.");
    }
    public double calc(){
        return (3.14)*r*r; //area of circle
    }

}
class Rectangle implements Shape{

    double l,w; //length,width

    //constructor
    public Rectangle(double l,double w){
        this.l = l;
        this.w = w;

    }
    public void disp(){
        System.out.println("\nThis is a Rectangle.");
    }
    public double calc(){
        return l*w; //Area of Rectangle
    }
}


public class P6_2_interface_Shape {
    public static void main(String args[]){
        Shape shape1 = null;
        int ch;
        Scanner s = new Scanner(System.in);
        try{

                System.out.println("\nSelect a shape :\n1.Circle.\n2.Rectangle.");
                ch=s.nextInt();
                switch(ch){
                    case 1:
                        double r;
                        System.out.println("\nEnter the radius of circle : ");
                        r = s.nextDouble();
                        shape1 = new Circle(r);
                        break;
                    case 2:
                        double l,w;
                        System.out.println("\nEnter length and width of rectangle : ");
                        l = s.nextDouble();
                        w = s.nextDouble();
                        shape1 = new Rectangle(l,w);
                        break;
                        
                    default:
                        System.out.println("\nInvalid Input.Try again : ");

                }
                
                
            
            if(shape1 != null){
                shape1.disp();
                System.out.println("Area : " +shape1.calc());
            }
        }
        catch(Exception e){
            System.out.println("\nError "+e);
        }
        s.close();
    }
}

