//PROGRAM : Pass by value /Call by value 
//->In java all the basic variables like integer,character,float are passed as "call by value"

class C1 {
    public void change(int a) {
        System.out.println("Value of 'a' in instance obj = " + a); // vala=5
        a = 20; // changing value of a in instance obj to 20
        System.out.println("Value of 'a' in instance obj = " + a);
    }
}

public class P40_pass_by_value {
    public static void main(String args[]) {
        int a = 5;
        C1 obj = new C1();
        obj.change(a);
        System.out.println("Value of 'a' in Main = " + a);
    }
}
/*
 * OUTPUT:
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P40_pass_by_value
Value of 'a' in instance obj = 5
Value of 'a' in instance obj = 20
Value of 'a' in Main = 5
 */