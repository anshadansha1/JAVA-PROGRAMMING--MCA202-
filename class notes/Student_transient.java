//PROGRAM : student_transient.java for implementing transient.
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

