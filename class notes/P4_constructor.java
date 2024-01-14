//Constructor
import java.io.*;

class Person{
    int age ;
    String name;
    public Person(){//constructor with no argument
        age =0;
        name ="";
    }
    public Person(int a ,String n){
        age = a;
        name = n;
    }
    public void disp(){
        System.out.println("\nName : "+ name +"Age : "+age);
    }
}
public class P4_constructor {
    public static void main(String args[]){
        Person p,q;
        p = new Person();
        q = new Person(25,"Manoj"); //constructor is invoked at the time of allocation
        p.disp();
        q.disp();
    }
}
