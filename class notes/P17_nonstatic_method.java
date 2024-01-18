
//In java to invoke a Non-static method you require an Object.
import java.util.*;

public class P17_nonstatic_method {
    // Non-Static Method
    public void disp() {
        System.out.println("\nIn disp");
    }

    public static void main(String args[]) {
        P17_nonstatic_method obj = new P17_nonstatic_method();
        obj.disp();// invoking a Non-static method with an object.
    }
}
