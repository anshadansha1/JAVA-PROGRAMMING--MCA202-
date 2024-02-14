//PROGRAM : Co-variant type

class P {
    public P getP() {
        return this;
    }

    public void disp() {
        System.out.println("\nIn P disp()");
    }
}

class C extends P {
    public P getP() {
        return super.getP();
    }

    public void disp() {
        System.out.println("\nIn C disp()");
    }
}

public class P43_covariant_type {
    public static void main(String args[]) {
        C obj = new C();
        obj.getP().disp();
    }
}

/*OUTPUT :
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P43_covariant_type

In C disp()
 */