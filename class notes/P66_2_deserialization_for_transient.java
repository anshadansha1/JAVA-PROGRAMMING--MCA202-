/*
 import java.io.Serializable;

public class Student_transient implements Serializable {
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

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class P66_2_deserialization_for_transient {
    public static void main(String args[])throws Exception{
        FileInputStream fin = new FileInputStream("f2.txt");
        ObjectInputStream in = new ObjectInputStream(fin); //
        Student_transient s =(Student_transient)in.readObject(); //reading an object from an "ObjectInputStream" and attempting to cast it to a 'Student' object.
        // If successful, the resulting 'Student' object is stored in the variable 's'
        s.disp();
        in.close();

    }
}
/*
 OUTPUT :

 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P66_2_deserialization_for_transient

102 null
 */