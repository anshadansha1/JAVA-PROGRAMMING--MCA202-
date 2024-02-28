/*
Student.java
--------------------------
import java.io.Serializable;
public class Student implements Serializable{
    private int id;
    private String name;
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    } 
    public void disp(){
        System.out.println("\n" + id + " " + name);
    }
}
 */

 //PROGRAM : Deserializaion

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class P65_deserializaion_student {
    public static void main(String args[])throws Exception{
        FileInputStream fin = new FileInputStream("f.txt");
        ObjectInputStream in = new ObjectInputStream(fin); //
        Student s =(Student)in.readObject(); //reading an object from an "ObjectInputStream" and attempting to cast it to a 'Student' object.
        // If successful, the resulting 'Student' object is stored in the variable 's'
        s.disp();
        in.close();

    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P65_deserializaion_student

101 Anshad Muhammad
 */