
import java.util.Scanner;

class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(String message) {
        super(message);
    }
}

public class P11_7_studentclass {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public P11_7_studentclass(int rollNo, String name, int age, String course) throws AgeOutOfRangeException {
        if (age < 15 || age > 21) {
            throw new AgeOutOfRangeException("Age must be between 15 and 21");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Course: ");
        String course = scanner.next();

        try {
            P11_7_studentclass student = new P11_7_studentclass(rollNo, name, age, course);
            System.out.println("\nStudent Details:");
            student.display();
        } catch (AgeOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
