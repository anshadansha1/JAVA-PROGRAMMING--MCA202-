/*PROGRAM 9_7:Write a program that illustrates interface inheritance.
 Interface P is extended by P1 and P2. Interface P12 inherits from both P1 and P2
 .Each interface declares one constant and one method. class Q implements P12.Instantiate Q and invoke each of its methods. 
Each method displays one of the constants. */
import java.util.*;

interface P {
    void methodP(); // method declaration
}

interface P1 extends P {
    void methodP1(); // method declaration
}

interface P2 extends P {
    void methodP2(); // method declaration
}

interface P12 extends P1, P2 {
    // No additional constants or methods here
}

class Q implements P12 {
    private int constantP;
    private int constantP1;
    private int constantP2;
    
    // Constructor to receive constants
    public Q(int constantP, int constantP1, int constantP2) {
        this.constantP = constantP;
        this.constantP1 = constantP1;
        this.constantP2 = constantP2;
    }
    
    // Implementing method from P1 interface
    public void methodP1() {
        System.out.println("Constant from P1: " + constantP1);
    }
    
    public void methodP2() {
        System.out.println("Constant from P2: " + constantP2);
    }
    
    public void methodP() {
        System.out.println("Constant from P: " + constantP);
    }
}

public class P9_7_interface_inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter constant value for P: ");
        int constantP = scanner.nextInt();
        
        System.out.print("Enter constant value for P1: ");
        int constantP1 = scanner.nextInt();
        
        System.out.print("Enter constant value for P2: ");
        int constantP2 = scanner.nextInt();
        
        // Instantiating Q with constants passed to its constructor
        Q q = new Q(constantP, constantP1, constantP2);
        
        q.methodP();
        q.methodP1();
        q.methodP2();
        
        scanner.close();
    }
}