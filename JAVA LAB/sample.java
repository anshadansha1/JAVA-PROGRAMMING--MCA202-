import java.util.Scanner;

// Interface Shape
interface Shape {
    void disp(); // Prototype to display the shape
    double calc(); // Prototype to calculate volume
}

// Class Circle implementing Shape interface
class Circle implements Shape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of disp() method
    public void disp() {
        System.out.println("This is a Circle.");
    }

    // Implementation of calc() method
    public double calc() {
        return Math.PI * radius * radius;
    }
}

// Class Rectangle implementing Shape interface
class Rectangle implements Shape {
    double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of disp() method
    public void disp() {
        System.out.println("This is a Rectangle.");
    }

    // Implementation of calc() method
    public double calc() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double radius, length, width;

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        Shape shape = null; // Reference of Shape interface

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                radius = scanner.nextDouble();
                shape = new Circle(radius); // Creating object of Circle class
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                width = scanner.nextDouble();
                shape = new Rectangle(length, width); // Creating object of Rectangle class
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        if (shape != null) {
            shape.disp(); // Calling disp() method depending on user choice
            System.out.println("Volume: " + shape.calc()); // Calling calc() method depending on user choice
        }

        scanner.close();
    }
}
