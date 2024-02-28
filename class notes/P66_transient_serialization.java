//PROGRAM : Transient : If you dont want to serialize a variable.Use transient.
//If a Variable is declared as transient ,it will not be serailized.


//PROGRAM : student_transient.java for implementing transient.
/*
import java.io.Serializable;

public class Student_transient implements serializable {
    private int id;
    transient private String name; //defining "name" as transient so that it will not be serialized.

    public Student_transient(int id,String name){
        this.id = id;
        this.name = name;
    } 
    public void disp(){
        System.out.println("\n" + id + " " + name);
    }
}
 */

import java.io.*; 
 
public class P66_transient_serialization {
    public static void main(String args[])throws Exception {
        Student_transient s1 = new Student_transient(102,"Harikrishnan");
        FileOutputStream fout = new FileOutputStream("f2.txt"); //To create a file
        ObjectOutputStream out = new ObjectOutputStream(fout);//write serialized object data to the file

        out.writeObject(s1); //writing object into file
        out.flush();
        System.out.println("\nSuccess");
    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P66_transient_serialization

Success
 */