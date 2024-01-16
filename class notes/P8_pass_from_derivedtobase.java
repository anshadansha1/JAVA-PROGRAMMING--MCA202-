//PROGRAM : To pass value from derived class constructor to base class constructor "SUPER FUNCTION" is used.

import java.util.*;

class Person_pass2{
    int age;
    String name;

    //constructor with no argument.//Default constructor of base class.
    public Person_pass2(){
        age=0;
        name="";
    }
    //constructor With argument.
    public Person_pass2(int a,String n){
        age = a;
        name = n;
    }
    //NOTE:[...If you have written a constructor with argument and if you doesnt have a default constructor...]
    //NOTE:[...The default constructor will be provided by the compiler if you have not written a constructor with argument...]
    public void disp(){
        System.out.println("\nName : "+name+" Age : "+age);
    }

}

class Teacher_pass2 extends Person_pass2{
    String subj;
    public Teacher_pass2(int a,String n,String s){
        super(a,n); //SUPER FUNCTION:to pass value from derived class constructor to base class constructor.
        subj = s;
    }
    public void disp(){
        super.disp();//super OBJECT:to overcome methode overriding.
        System.out.println("\nSubject : "+subj);

    }
}
public class P8_pass_from_derivedtobase {
    public static void main(String args[]){
            Person_pass2 p;
            Teacher_pass2 t;
            p = new Person_pass2(25,"Anshad");
            t = new Teacher_pass2(35,"Muhammad","cs");
            p.disp();
            t.disp();
    }
}

//NOTE[.........Super function should be the first statement before the derived class constructor]
/*SUPER OBJECT VS SUPER FUNCTION :
----------------------------------
>Super Object : [Used to access any public data members or member functions from a derived class]
>Super Function :  [Used to pass the value from derived class constructor to base class constructor]
*/



/*OUTPUT:
E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P8_pass_from_derivedtobase

Name : Anshad Age : 25

Name : Muhammad Age : 35

Subject : cs
*/