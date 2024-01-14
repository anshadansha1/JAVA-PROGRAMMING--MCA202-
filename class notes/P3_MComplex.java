/*Question: Create a class with name "Complex" having r and i as data members.Provide functions for the following:
1.read(),2.disp(),3.add(),4.mult().*/

import java.util.*;

class Complex{
    double r,i;
    public void read(){
        Scanner s = new Scanner(System.in);
        
        try{
            System.out.println("\nEnter the real part of complex number(r) : ");
            r = s.nextDouble();
            System.out.println("\nEnter the imaginary part of complex number(i) :");
            i = s.nextDouble();
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }   
        
    }
    public void disp(){
        System.out.println( r +"+"+i+"i");
    }
    public Complex add(Complex q){
        Complex t = new Complex(); //temporary data member to object Complex.
        t.r = r + q.r;
        t.i = i + q.i;
        return t;
    }
    public Complex mult(Complex q){
        Complex t = new Complex();
        t.r = r * q.r - i * q.i;
        t.i = r * q.i + i * q.r;
        return t;
    }
    
}
public class P3_MComplex {
    public static void main(String args[]){
        Complex p,q,r;
        p = new Complex();
        q = new Complex(); 
        System.out.println("\nEnter first complex number details --> ");
        p.read();
        System.out.println("\nEnter Second complex number details --> ");
        q.read();
        r = p.add(q); //adding
        System.out.println("\nFirst complex number is : ");
        p.disp();
        System.out.println("\nSecond complex number is : ");
        q.disp();
        System.out.println("\nAfter addition complex number is : ");
        r.disp(); //displaying 
        r = p.mult(q);//multiplying
        System.out.println("\nAfter addition complex number is : ");
        r.disp(); //displaying
        //s.close(); //closing scanner
 
    }
}
