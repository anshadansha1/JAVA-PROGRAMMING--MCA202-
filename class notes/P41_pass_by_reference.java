//PROGRAM : Pass by Reference /Call by Reference
//->All objects in java uses the concept of call by reference

class Cint {
    public int a;
}

class C1_a {
    public void change(Cint p) { // receiving the reference of passed object q as p.
        System.out.println("\nValue of 'a' = " + p.a);
        p.a = 20;
        System.out.println("\nValue of 'a' = " + p.a);
    }
}

public class P41_pass_by_reference {
    public static void main(String args[]) {
        Cint q = new Cint();
        q.a = 5;
        C1_a obj = new C1_a();
        obj.change(q); // Passing the reference of object q.
        System.out.println("\nValue of 'a' = " + q.a);
    }
}

/*OUTPUT:
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P41_pass_by_reference

Value of 'a' = 5

Value of 'a' = 20

Value of 'a' = 20
 */