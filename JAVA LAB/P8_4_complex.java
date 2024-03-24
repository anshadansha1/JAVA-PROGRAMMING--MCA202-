//PROGRAM 8_4 : Write the definition for a class called Complex that has floating point data members for storing real and imaginary parts. Define a function Complex sum(Complex) to add two complex numbers 
import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Default constructor
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter methods
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Setter methods
    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex sum(Complex other) {
        double realPart = this.real + other.getReal();
        double imaginaryPart = this.imaginary + other.getImaginary();
        return new Complex(realPart, imaginaryPart);
    }

    // Method to display complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class P8_4_complex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating three complex number objects
        Complex complex1 = new Complex();
        Complex complex2 = new Complex();
        Complex complex3;

        // Taking input for complex number 1
        System.out.println("Enter real and imaginary parts for complex number 1:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        complex1.setReal(real1);
        complex1.setImaginary(imaginary1);

        // Taking input for complex number 2
        System.out.println("Enter real and imaginary parts for complex number 2:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        complex2.setReal(real2);
        complex2.setImaginary(imaginary2);

        // Calculating sum and assigning it to complex number 3
        complex3 = complex1.sum(complex2);

        // Displaying all complex numbers
        System.out.println("Complex number 1:");
        complex1.display();
        System.out.println("Complex number 2:");
        complex2.display();
        System.out.println("Sum of complex number 1 and complex number 2:");
        complex3.display();

        scanner.close();
    }
}
