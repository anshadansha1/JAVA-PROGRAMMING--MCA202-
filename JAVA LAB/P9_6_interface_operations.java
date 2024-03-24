/*PROGRAM 9_6 :Define an interface “Operations” which has method area(), volume(). 
Define a constant PI having value 3.14. Create class a Cylinder( with member variable height) which implements this interface.
 Create one object and calculate area and volume. Add Required Constructors. */
import java.util.Scanner;

// Define interface Operations
interface Operations {
    double PI = 3.14; // constant
    
    double area(); // method to calculate area
    double volume(); // method to calculate volume
}

// Implementing class Cylinder
class Cylinder implements Operations {
    double height; // member variable
    
    // Constructor
    public Cylinder(double height) {
        this.height = height;
    }
    
    // Method to calculate area
    public double area() {
        return 2 * PI * height;
    }
    
    // Method to calculate volume
    public double volume() {
        return PI * height * height;
    }
}

public class P9_6_interface_operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        Cylinder cylinder = new Cylinder(height); // Creating an object of Cylinder
        
        // Calculating area and volume
        double area = cylinder.area();
        double volume = cylinder.volume();
        
        // Displaying the results
        System.out.println("Area of the cylinder: " + area);
        System.out.println("Volume of the cylinder: " + volume);
        
        scanner.close();
    }
}