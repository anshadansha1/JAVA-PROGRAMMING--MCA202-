/*PROGRAM : [4TH PROPERTY OF CONSTRUCTOR : "If a constructor declared as private directly
 its not possible to create an object outside the class.
 Solution : So, here we pass that constructor "pc()" to main method." 
*/

class pc{
    static int count = 0;
    int a;
    private pc(){ //private constructor
        a = 10;
    }
    public void disp(){
        System.out.println(a);
    }
    public static pc create(){
        count++;
        return new pc();// private constructor "pc()" is returned to main function. 
    }
}
public class P20_private_constructor {
    public static void main(String args[]){
        pc obj = pc.create(); // 
        pc obj2 = pc.create(); //
        obj.disp();
        obj2.disp();
        System.out.println(pc.count);
    }   
}

/*
 OUTPUT:
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P20_private_constructor
10
10
2
 */