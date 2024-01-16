//Program : How to pass the value from base class to derived class.

import java.util.*;

class Person_pass{
    int age;
    String name;

    //constructor with no argument.//Default constructor of base class.
    public Person_pass(){
        age=0;
        name="";
    }
    //constructor With argument.
    public Person_pass(int a,String n){
        age = a;
        name = n;
    }
    //NOTE:[...If you have written a constructor with argument and if you doesnt have a default constructor...]
    //NOTE:[...The default constructor will be provided by the compiler if you have not written a constructor with argument...]
    public void disp(){
        System.out.println("\nName : "+name+" Age : "+age);
    }

}

class Teacher_pass extends Person_pass{
    String subj;
    public Teacher_pass(int a,String n,String s){
        subj = s;
    }
    public void disp(){
        super.disp();//super object:to overcome methode overriding.
        System.out.println("\nSubject : "+subj);

    }
}
public class P7_pass_from_basetoderived {
        public static void main(String args[]){
            Person_pass p;
            Teacher_pass t;
            p = new Person_pass(25,"Anshad");
            t = new Teacher_pass(35,"Muhammad","cs");
            p.disp();
            t.disp();
        }
}


/*OUTPUT:
E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P7_pass_from_basetoderived

Name : Anshad Age : 25

Name :  Age : 0

Subject : cs
*/