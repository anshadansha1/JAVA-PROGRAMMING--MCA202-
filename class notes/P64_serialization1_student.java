//PROGRAM :Serialization : Storing an object into a stream(stream can be  a file,....)
//Deserializaion : Retrieving an object from a stream.
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
//PROGRAM : Serializaion
import java.io.*;

public class P64_serialization1_student {
    public static void main(String args[])throws Exception {
        Student s1 = new Student(101,"Anshad Muhammad");
        FileOutputStream fout = new FileOutputStream("f.txt"); //To create a file
        ObjectOutputStream out = new ObjectOutputStream(fout);//write serialized object data to the file

        out.writeObject(s1); //writing object into file
        out.flush();
        System.out.println("\nSuccess");
    }
}
