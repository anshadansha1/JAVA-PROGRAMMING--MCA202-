//PROGRAM : Generic Method , A generic methods always supports different types of objects.

class Test{
    public <T> void disp(T a,T b){ //generic method
        System.out.println(" "+a+b);
    }
}
public class P46_generic_method {
    public static void main(String args[]){
       
        Integer i1 = new Integer(10);
        Integer i2 = 20;
       
        String s1 = "hello";
        String s2 = new String("World");

        Test obj = new Test();
        obj.disp(i1,i2);
        obj.disp(s1,s2);

    }
}

/*OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>javac P46_generic_method.java
P46_generic_method.java:11: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
        Integer i1 = new Integer(10);
                     ^
1 warning

E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P46_generic_method
 1020
 helloWorld
 */