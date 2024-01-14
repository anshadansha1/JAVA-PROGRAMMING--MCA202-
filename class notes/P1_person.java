import java.io.*;
class Person{
    int age; //data members
    String name;
    public void setPerson(int a,String n){
        age=a;
        name=n;
    } 
    public void dispPerson() //member functions
    {
        System.out.println("Name : "+name+"Age : "+ age);
    }
}

public class P1_person{
    public static void main(String args[]){
        Person p,q;
        p = new Person();
        q = new Person();
        p.setPerson(20,"abcd\n");
        q.setPerson(30,"add\n");
        p.dispPerson();
        q.dispPerson();
    }
}