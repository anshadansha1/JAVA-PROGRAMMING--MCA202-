//PROGRAM 8_1 : Write a Java program to calculate the area of different shapes namely circle, rectangle, trapezoid and triangle. (Use the concepts of JAVA like this keyword, constructor overloading and method overloading)



import java.util.Scanner;

class AreaCalculator {
    // Circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Trapezoid
    public double calculateArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }

    // Triangle
    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class P8_1_area_of_shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalculator = new AreaCalculator();
        int choice = 0;
        do {
            System.out.println("\nChoose a shape to calculate its area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Trapezoid");
            System.out.println("4. Triangle");
            System.out.println("5. Exit.\nSelect any one : ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the circle:");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + areaCalculator.calculateArea(radius));
                    break;
                case 2:
                    System.out.println("Enter the length and width of the rectangle:");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    System.out.println("Area of the rectangle: " + areaCalculator.calculateArea(length, width));
                    break;
                case 3:
                    System.out.println("Enter the lengths of the two bases and the height of the trapezoid:");
                    double base1 = scanner.nextDouble();
                    double base2 = scanner.nextDouble();
                    double heightTrapezoid = scanner.nextDouble();
                    System.out.println(
                            "Area of the trapezoid: " + areaCalculator.calculateArea(base1, base2, heightTrapezoid));
                    break;
                case 4:
                    System.out.println("Enter the base and height of the triangle:");
                    double baseTriangle = scanner.nextDouble();
                    double heightTriangle = scanner.nextDouble();
                    System.out.println("Area of the triangle: "
                            + areaCalculator.calculateTriangleArea(baseTriangle, heightTriangle));
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                    // System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
