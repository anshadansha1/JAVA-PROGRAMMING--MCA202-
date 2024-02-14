//PROGRAM : Generic class 

class Test2 <T>{ //generic class
    T a;
    public Test2(T aa){
        a = aa;
    }
    public void disp(){
        System.out.println("\n a = " + a);
    }
}
public class P47_generic_class {    
    public static void main(String args[]){
        Test2 <Integer> t1 = new Test2(10);
        Test2 <String> t2 = new Test2("Hello");
        t1.disp();
        t2.disp();
    }
    
}

/*OUTPUT:
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P47_generic_class

 a = 10

 a = Hello
 */