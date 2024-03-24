//PROGRAM 9_3 : Write a Java program to implement the following level of inheritance.

class Staff {
    String code;
    String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Faculty extends Staff {
    String department;
    String subjectTaken;
    String researchArea;

    public Faculty(String code, String name, String department, String subjectTaken, String researchArea) {
        super(code, name);
        this.department = department;
        this.subjectTaken = subjectTaken;
        this.researchArea = researchArea;
    }

    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Subject Taken: " + subjectTaken);
        System.out.println("Research Area: " + researchArea);
    }
}

class Typist extends Staff {
    String office;
    int speed;

    public Typist(String code, String name, String office, int speed) {
        super(code, name);
        this.office = office;
        this.speed = speed;
    }

    public void display() {
        super.display();
        System.out.println("Office: " + office);
        System.out.println("Speed: " + speed);
    }
}

class Officer extends Staff {
    String rank;
    String grade;

    public Officer(String code, String name, String rank, String grade) {
        super(code, name);
        this.rank = rank;
        this.grade = grade;
    }

    public void display() {
        super.display();
        System.out.println("Rank: " + rank);
        System.out.println("Grade: " + grade);
    }
}

class Permanent extends Typist {
    double salary;

    public Permanent(String code, String name, String office, int speed, double salary) {
        super(code, name, office, speed);
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

class Casual extends Typist {
    double dailyWages;

    public Casual(String code, String name, String office, int speed, double dailyWages) {
        super(code, name, office, speed);
        this.dailyWages = dailyWages;
    }

    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class P9_3_inheritance_levels {
    public static void main(String[] args) {
        Faculty faculty = new Faculty("F101", "Ansahd Muhammad", "Computer Science", "Java Programming", "Machine Learning");
        Officer officer = new Officer("O201", "Majo", "Manager", "Grade A");
        Permanent permanent = new Permanent("T301", "Nihal", "Front Office", 50, 50000.0);
        Casual casual = new Casual("T401", "Hari", "Back Office", 40, 1000.0);

        System.out.println("Faculty Details:");
        faculty.display();

        System.out.println("\nOfficer Details:");
        officer.display();

        System.out.println("\nPermanent Typist Details:");
        permanent.display();

        System.out.println("\nCasual Typist Details:");
        casual.display();
    }
}
