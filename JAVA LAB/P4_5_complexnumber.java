//PROGRAM 4_5 : Create a class complex having a real and imaginary part. Provide functions for read, display, add and multiplying two complex numbers.
import java.io.*;
import java.util.*;

class Complex{
    double r; //r - real part
    double i; //i - imaginary part

    // //constructor
    // public Complex(double r,double i){
    //     this.r = r;
    //     this.i = i;
    // }

    //Reading complex number from user
    public void read(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter the real part : ");
            r = s.nextDouble();
            System.out.println("\nEnter the imaginary part : ");
            i = s.nextDouble();
        }
        catch(Exception e){
            System.out.println("\nErro : "+e);
        }
    }

    //display
    public void disp(){
        System.out.println("\nComplex number : "+ r + " + " + i + "i");
    }

    //Adding
    public Complex add(Complex cp2){
        Complex t=new Complex();
        t.r=r+cp2.r;
        t.i=i+cp2.i;
        return t;

    }
    public Complex mul(Complex cp2){
        Complex t2 = new Complex();
        t2.r = (r*cp2.r) - (i*cp2.i) ;
        t2.i = (r*cp2.i) + (i*cp2.r) ;
        return t2;
    }


}
public class P4_5_complexnumber{
    public static void main(String args[]){
        Complex cp1,cp2,s,z;
        cp1 = new Complex();
        cp2 = new Complex();

        //Read
        System.out.println("\nEnter the first complex number : ");
        cp1.read();
        System.out.println("\nEnter the second complex number : ");
        cp2.read();
        //display
        System.out.println("\nEntered complex numbers are : ");
        cp1.disp();
        cp2.disp();

        //Add
        s = cp1.add(cp2);

        s.disp();

        z = cp1.mul(cp2);

        z.disp();


    }
}