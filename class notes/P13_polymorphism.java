//polymorphism - One object is behaving different forms in different situations. 
//PROGRAM : Create an interface called ishape which contains two prototypes : area() and perimeter().
//Circle and Rectangle are two classes which implements above interface and uses constructors for initializing the respective values.
//Create an array of ishape objects to store the objects Circle or Rectangle as decided by the user.
import java.util.*;
interface ishape{
    public double area();
    public double perimeter();
}
class Rectangle implements ishape{
    double l,b;
    //constructor
    public Rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
}

class Circle implements ishape{
    double r;
    //constructor
    public Circle(double r){
        this.r = r;
    }
    public double area(){
        return (3.14*r*r);
    }
    public double perimeter(){
        return 2*(3.14)*r;
    }

}
public class P13_polymorphism {
    public static void main(String args[]){
        ishape obj[];//array object
        int n,i,ch,count=0;
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter no.of objects : ");
            n = s.nextInt();
            obj = new ishape[n];
            for(i=0;i<n;i++){
                System.out.println("\n1.Rectangle.\n2.Circle.");
                ch=s.nextInt();
                switch(ch){
                    case 1:
                        double l,b;
                        System.out.println("\nEnter length and breadth : ");
                        l = s.nextDouble();
                        b = s.nextDouble();
                        obj[i]=new Rectangle(l, b);
                        break;
                    case 2:
                        double r;
                        System.out.println("\nEnter the radius : ");
                        r = s.nextDouble();
                        obj[i] = new Circle(r);
                        break;
                    default:
                        System.out.println("\nInvalid Input.Try again : ");

                }
                
                
            }
            for(i=0;i<n;i++){
                System.out.println("Area : " + obj[i].area());
                System.out.println("Perimeter : " +obj[i].perimeter());
            }
        }
        catch(Exception e){
            System.out.println("\nError "+e);
        }
        s.close();
    }
}


/*OUTPUT:
E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P13_polymorphism

Enter no.of objects :
2

1.Rectangle.
2.Circle.
1

Enter length and breadth :
2
3

1.Rectangle.
2.Circle.
2

Enter the radius :
5
Area : 6.0
Perimeter : 10.0
Area : 78.5
Perimeter : 31.400000000000002
 
 */