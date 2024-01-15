//Inheritance Example program: "The properties and knowledge of a general category is applied to the person and knowledge of a specific category  "
import java.util.*;

class Person{
    int age;
    String name;
    public void readp(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter Name and Age : ");
            name = s.nextLine(); //for reading string
            age = s.nextInt(); //for reading int
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }

    public void disp(){
        System.out.println("\nName : "+name+" Age : "+age);
    }
}

//Inheritance :
class Teacher extends Person{
    String subj;
    public void readt(){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter the subject : ");
            subj = s.nextLine();
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }

    public void dispt(){
        System.out.println("\nSubject : "+subj);
    }
}

public class P5_inheritance {
    public static void main(String args[]){
        Person p;
        Teacher t;
        p = new Person();
        t = new Teacher();
        p.readp();
        t.readt();
        t.readp();
        p.disp();
        t.disp();
        t.dispt();
    }   
}
