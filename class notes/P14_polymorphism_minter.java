
//instanceof : to check whether an object is  an instance of  a class
import java.util.*;

interface i1 {
    void disp();
}

class Ca1 implements i1 {
    public void disp() {
        System.out.println("\nIn disp C3");
    }
}

class Ca2 implements i1 {
    public void disp() {
        System.out.println("\nin disp C4");
    }
}

public class P14_polymorphism_minter {
    public static void main(String args[]) {
        i1 obj[] = new i1[3];
        obj[0] = new Ca1();
        obj[1] = new Ca2();
        obj[2] = new Ca1();
        for (int i = 0; i < 3; i++) {
            if (obj[i] instanceof Ca1) { // Chechking if "obj[i]"" is an instance of class "Ca1" or not.
                Ca1 p = (Ca1) obj[i]; // TYPE CASTING
                p.disp();
            } else if (obj[i] instanceof Ca2) {
                Ca2 p = (Ca2) obj[i];
                p.disp();
            }
        }
    }
}

/*
 * OUTPUT :
 * 
 * E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P14_polymorphism_minter
 * 
 * In disp C3
 * 
 * in disp C4
 * 
 * In disp C3
 * 
 */
