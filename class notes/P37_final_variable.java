//PROGRAM : "Final Variable" : You cannot change the value(it becomes constant) after you declare a variable as final.
import java.io.*;

class CFinal{
    final int a = 10;//Variable "a" is declared as final with value "10";
    public void change(){
        //a = 20;//Trying to change a final variable.//error: cannot assign a value to final variable
    }
    public void disp(){
        System.out.println(a);
    }
}
public class P37_final_variable {
    public static void main(String args[]) {
        CFinal obj = new CFinal();
        //obj.change(); //error: cannot assign a value to final variable
        obj.disp();
    }
}

/*9
 OUTPUT : 
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P37_final_variable
10

 */