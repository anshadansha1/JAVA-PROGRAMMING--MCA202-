/*PROGRAM : Final Class

->A Class which is declared as Final, can have both final and non-final methods.
->If a Method is declared as final it cannot be Overridden.
->If a Class is declared as final it cannot be Inherited(extended).
*/

final class CBase { // final class
    public final void disp() {// final method
        System.out.println("\nDisplay");
    }

    public void show() {
        System.out.println("\nShow");
    }
}

// class CDerived2 extends CBase {} : ->Final class Cannot be
// inherited(extended)

public class P39_final_class {
    public static void main(String args[]) {
        CBase obj = new CBase();
        obj.disp();
        obj.show();
    }
}

/*OUTPUT 
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P39_final_class

Display

Show
*/