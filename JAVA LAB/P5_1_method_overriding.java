//PROGRAM 5_1:WAP (menu driven) to demonstrate method overriding in java, by displaying details of a student, and a teacher. 
//Function/method overriding : "if child class has the same method as declared in the parent class,it is called method overriding".
//Solved using : SUPER OBJECT
import java.util.*;


class Person{
    int age;
    String name;
    public void read(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter the Name : ");
            name = s.nextLine(); //for reading string
            System.out.println("\nEnter the Age : ");
            age = s.nextInt(); //for reading int
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }

    public void disp(){
        System.out.println("\nName : "+name+"\nAge : "+age);
    }
}

class Student extends Person{
    String course;
    public void read(){
        super.read();//SUPER OBJECT : is used to overcome method overriding
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter the course : ");
            course = s.nextLine();
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }

    public void disp(){
        super.disp();//SUPER OBJECT : is used to overcome method overriding
        System.out.println("\nCourse : "+course);
    }
}

class Teacher extends Person{
    String subj;
    public void read(){
        super.read(); 
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter the subject : ");
            subj = s.nextLine();
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }

    public void disp(){
        super.disp();
        System.out.println("\nSubject : "+subj);
    }
}


public class P5_1_method_overriding {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int ch;
        Student s1 = new Student();
        Teacher t1 = new Teacher();
        do{
            System.out.println("\n1.Read and display Student Details.");
            System.out.println("\n2.Read and display Teacher Details.");
            System.out.println("\nEnter your choice : ");
            ch=s.nextInt();
            switch (ch) {
                case 1:
                    s1.read();
                    s1.disp();
                    break;
                case 2:
                    t1.read();
                    t1.disp();
                    break;
                case 3:
                System.out.println("\nExiting");
                    break;
                default:
                    System.out.println("\nInvalid input.Try again");
                    break;
            }
        }while(ch != 3);
    }
}
