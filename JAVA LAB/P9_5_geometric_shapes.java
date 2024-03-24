/*PROGRAM 9_5 : 5.write a program to represent geometric shapes and some operations that can be performed on them.
 The idea here is that shapes in higher dimensions inherit data from lower dimensional shapes.
  For example a cube is a three dimensional square. A sphere is a three dimensional circle and a glome is a four dimensional circle.
   A cylinder is another kind of three dimensional circle. The circle, sphere, cylinder, and glome all share the attribute radius. 
   The square and cube share the attribute side length. 
There are various ways to use inheritance to relate these shapes but please follow the inheritance described in the table below.  */
import java.util.Scanner;

// Area interface
interface Area {
    double calculateArea();
}

// Volume interface
interface Volume {
    double calculateVolume();
}

// Shape class
class Shape {
    String name;

    public Shape() {
        this.name = "Generic Shape";
    }

    public String getName() {
        return name;
    }
}

// Circle class
class Circle extends Shape implements Area {
    double radius;

    public Circle(double r, String n) {
        this.radius = r;
        this.name = n;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square class
class Square extends Shape implements Area {
    double side;

    public Square(double s, String n) {
        this.side = s;
        this.name = n;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Cylinder class
class Cylinder extends Circle implements Volume {
    double height;

    public Cylinder(double h, double r, String n) {
        super(r, n);
        this.height = h;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

// Sphere class
class Sphere extends Circle implements Volume {
    public Sphere(double r, String n) {
        super(r, n);
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

// Cube class
class Cube extends Square implements Volume {
    public Cube(double s, String n) {
        super(s, n);
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}

// Glome class
class Glome extends Sphere implements Volume {
    public Glome(double r, String n) {
        super(r, n);
    }

    @Override
    public double calculateVolume() {
        return 0.5 * Math.PI * Math.PI * radius * radius * radius * radius;
    }
}

public class P9_5_geometric_shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for creating Circle
        System.out.println("Enter radius for Circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius, "Circle");
        System.out.println(circle.getName() + " - Area: " + circle.calculateArea());

        // Input for creating Square
        System.out.println("Enter side length for Square:");
        double side = scanner.nextDouble();
        Square square = new Square(side, "Square");
        System.out.println(square.getName() + " - Area: " + square.calculateArea());

        // Input for creating Cylinder
        System.out.println("Enter radius for Cylinder:");
        radius = scanner.nextDouble();
        System.out.println("Enter height for Cylinder:");
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(height, radius, "Cylinder");
        System.out.println(cylinder.getName() + " - Area: " + cylinder.calculateArea() + ", Volume: " + cylinder.calculateVolume());

        // Input for creating Sphere
        System.out.println("Enter radius for Sphere:");
        radius = scanner.nextDouble();
        Sphere sphere = new Sphere(radius, "Sphere");
        System.out.println(sphere.getName() + " - Area: " + sphere.calculateArea() + ", Volume: " + sphere.calculateVolume());

        // Input for creating Cube
        System.out.println("Enter side length for Cube:");
        side = scanner.nextDouble();
        Cube cube = new Cube(side, "Cube");
        System.out.println(cube.getName() + " - Area: " + cube.calculateArea() + ", Volume: " + cube.calculateVolume());

        // Input for creating Glome
        System.out.println("Enter radius for Glome:");
        radius = scanner.nextDouble();
        Glome glome = new Glome(radius, "Glome");
        System.out.println(glome.getName() + " - Area: " + glome.calculateArea() + ", Volume: " + glome.calculateVolume());

        scanner.close();
    }
}