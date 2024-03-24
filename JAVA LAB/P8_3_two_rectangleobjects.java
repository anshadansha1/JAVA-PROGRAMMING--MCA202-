//PROGRAM 8_3 : Write a main function to create two rectangle objects and display its area and perimeter. Check whether the two Rectangles have the same area and print a message indicating the result. (Use the concept of this pointer too)  

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
        return 2 * (this.length + this.width); // using this pointer to refer to the instance variables
    }

    // Method to calculate area
    public double calculateArea() {
        return this.length * this.width; // using this pointer to refer to the instance variables
    }

    // Method to check if two rectangles have the same area
    public boolean sameArea(Rectangle otherRectangle) {
        return this.calculateArea() == otherRectangle.calculateArea();
    }
}

public class P8_3_two_rectangleobjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating rectangle objects
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        // Taking input for rectangle 1
        System.out.println("Enter length and width for rectangle 1:");
        double length1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        rectangle1.setLength(length1);
        rectangle1.setWidth(width1);

        // Taking input for rectangle 2
        System.out.println("Enter length and width for rectangle 2:");
        double length2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        rectangle2.setLength(length2);
        rectangle2.setWidth(width2);

        // Displaying area and perimeter of rectangle 1
        System.out.println("Area of rectangle 1: " + rectangle1.calculateArea());
        System.out.println("Perimeter of rectangle 1: " + rectangle1.calculatePerimeter());

        // Displaying area and perimeter of rectangle 2
        System.out.println("Area of rectangle 2: " + rectangle2.calculateArea());
        System.out.println("Perimeter of rectangle 2: " + rectangle2.calculatePerimeter());

        // Checking if rectangle 1 and rectangle 2 have the same area
        if (rectangle1.sameArea(rectangle2)) {
            System.out.println("Rectangle 1 and Rectangle 2 have the same area.");
        } else {
            System.out.println("Rectangle 1 and Rectangle 2 don't have the same area.");
        }

        scanner.close();
    }
}
