//PROGRAM 8_2 :Define a class called Rectangle with member variables length and width. Use appropriate member functions to calculate the perimeter and area of the rectangle. Define another member function int sameArea(Rectangle) that has one parameter of type Rectangle. sameArea returns 1 if the two Rectangles have the same area, and returns 0 if they don't. Use appropriate constructors to initialize the member variables(Use both default and parameterized constructor) 

import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to check if two rectangles have the same area
    public int sameArea(Rectangle otherRectangle) {
        if (this.calculateArea() == otherRectangle.calculateArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class P8_2_member_functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for first rectangle
        System.out.println("Enter length and width for rectangle 1:");
        double length1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(length1, width1);

        // Taking input for second rectangle
        System.out.println("Enter length and width for rectangle 2:");
        double length2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        Rectangle rectangle2 = new Rectangle(length2, width2);

        // Calculating and printing perimeter and area of rectangle 1
        System.out.println("Perimeter of rectangle 1: " + rectangle1.calculatePerimeter());
        System.out.println("Area of rectangle 1: " + rectangle1.calculateArea());

        // Calculating and printing perimeter and area of rectangle 2
        System.out.println("Perimeter of rectangle 2: " + rectangle2.calculatePerimeter());
        System.out.println("Area of rectangle 2: " + rectangle2.calculateArea());

        // Checking if rectangle 1 and rectangle 2 have the same area
        if (rectangle1.sameArea(rectangle2) == 1) {
            System.out.println("Rectangle 1 and Rectangle 2 have the same area.");
        } else {
            System.out.println("Rectangle 1 and Rectangle 2 don't have the same area.");
        }

        scanner.close();
    }
}
