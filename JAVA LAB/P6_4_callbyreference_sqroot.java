//PROGRAM 6_4 :  WAP to implement a function using call by reference to find the square root of a given number.
import java.util.*;

class Storage{
    float value;

    Storage(float value){
        this.value = value;
    }
} 
class Sqroot{
    static void squarerootfinder(Storage num){ //defining this method as static since ,static method can be called without creating objects
        num.value = (float)Math.sqrt(num.value);
    }
}

public class P6_4_callbyreference_sqroot {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter a float number to find square root : ");
            float input = s.nextFloat();
            Storage num = new Storage(input);
             
            
            System.out.println("\nBefore calculating square root , Value = "+num.value);
            Sqroot.squarerootfinder(num);//static method can be called without creating objects.
            System.out.println("\nAfter calculating square root , Value = "+num.value);

        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}
