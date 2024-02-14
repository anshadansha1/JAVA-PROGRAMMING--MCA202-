//PROGRAM : Initializer block , almost similar to constructor.

class Test {
    int a;
    // Initializer block
    {
        a = 10;// data member
    }

    public void disp() {
        System.out.println("\nValue of 'a' = " + a);
    }
}

public class P42_initializer_block {
    public static void main(String args[]) {
        Test t1, t2;
        t1 = new Test();
        t2 = new Test();
        t1.disp();
        t2.disp();
    }
}

/*OUTPUT :
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P42_initializer_block

Value of 'a' = 10

Value of 'a' = 10

 */
