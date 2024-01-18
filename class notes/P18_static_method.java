
//Like previous program,In java to invoke a Static method you NOT NEED an Object.
import java.util.*;

public class P18_static_method {
    // Static method
    public static void disp() {
        System.out.println("\nIn disp");
    }

    public static void main(String args) {
        disp(); // invoking static method directly.
    }
}
