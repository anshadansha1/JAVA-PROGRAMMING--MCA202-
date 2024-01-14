//Adding numbers in object oriented way
import java.io.*;

class Num{
    int a;
    public void read(){
        DataInputStream din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter the value : " );
            a = Integer.parseInt(din.readLine());
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
    public void disp(){
        System.out.println("a = "+a);
    }
    public Num add(Num q){ //Here instead of int we use "Num" as return type.
        Num t = new Num(); //temporary member to object Num.
        t.a = a + q.a;
        return t;
    }
}
public class P2_Num {
    public static void main(String args[]){
        Num p,q,r;
        p = new Num();
        q = new Num();
        p.read(); //input : 10
        q.read(); //input : 5
        r=p.add(q); //Here "r" is not  allocated memory.But the memory used for "t" is taken by "r".
        p.disp();
        q.disp();
        r.disp();//output : 15 
    }
    
}
