
//PROGRAM : How can you invoke static method present in another class?

/*NOTE : [1.A static method can be invoked without creating an object.
2.A static method can invoke other Static methods either by directly or by using "class_name.function_name"
3.A static method can access only static data members directly (You cannot access a Non-static function from static method).
    (If you want to access a Non-static members ,it is possible by creating objects)  ]

*/
import java.util.*;

class Cs1 {
    // Static method
    public static void disp() {
        System.out.println("In disp Cs1");
    }
}

class Cs2 {
    // Static method
    public static void disp() {
        System.out.println("\nIn disp Cs2");
    }
}

public class P19_static_another_class {
    // Static method
    public static void disp() {
        System.out.println("\nin disp");
    }

    public static void main(String args[]) {
        disp(); // invoking disp() present in same class.
        Cs1.disp();// invoking disp() present in another class "Cs1".
        Cs2.disp();// invoking disp() present in another class "Cs2".
    }
}

/*
 * OUTPUT :
 * E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P19_static_another_class
 * 
 * in disp
 * In disp Cs1
 * 
 * In disp Cs2
 * 
 */