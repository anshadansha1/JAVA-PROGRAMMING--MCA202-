//Function/method overriding : "if child class has the same method as declared in the parent class,it is called method overriding".

//In the previous program of inheritance there is such case lets resolve it here :
//Solved using : SUPER OBJECT

import java.util.*;

class Person2{
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

class Teacher2 extends Person2{
    String subj;
    public void readt(){
        super.readp(); //SUPER OBJECT : is used to overcome method overriding
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
        super.disp();//SUPER OBJECT : is used to overcome method overriding
        System.out.println("\nSubject : "+subj);
    }
}


public class P6_function_overrinding {
    public static void main(String args[]){
        Person2 p;
        Teacher2 t;
        p = new Person2();
        t = new Teacher2();
        p.readp();
        t.readt();
        t.readp();
        p.disp();
        t.disp();
        t.dispt();
    }
}
