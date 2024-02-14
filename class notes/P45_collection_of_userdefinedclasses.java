//PROGRAM : Collection of Userdefined classes

import java.io.*;
import java.util.*;

class Emp{
    int no;
    String name;
    public Emp(int n,String nn){
        no = n;
        name = nn;
    }
    public void disp(){
        System.out.println("\n"+no+" "+name);
    }
    public String toString(){ //toString : method used to convert to equivalent string value.
        return no+" "+name;
    }
}
public class P45_collection_of_userdefinedclasses {
    public static void main(String args[]){
        List list = new ArrayList<>();

        Integer I = new Integer(12);
        String str = "Test";
        Float f = new Float(123.5F); //F in 123.5F : if F is not there it will convert it to double.
        
        Emp e = new Emp(10,"sss");

        list.add(I);
        list.add(str);
        list.add(e);
        list.add(f);

        Integer IR;
        String SR;
        Float FR;
        Emp ee;

        Iterator i = list.iterator();
        while(i.hasNext()){
            Object obj = i.next(); //retrieving back object
            if(obj instanceof Integer){
                IR=(Integer)obj;
                System.out.println(IR.intValue()); //intValue : to get corresponding integer value.
            }
            else if(obj instanceof String){
                SR = (String)obj;
                System.out.println(SR);
            }
            else if(obj instanceof Float){
                FR = (Float)obj;
                System.out.println(FR.floatValue()); //floatValue : to get corresponding float value.
            }
            else if(obj instanceof Emp){
                ee = (Emp)obj;
                //ee.disp();
                System.out.println(ee);
            }
        }
    }
}

/*
 OUTPUT:
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>javac P45_collection_of_userdefinedclasses.java
P45_collection_of_userdefinedclasses.java:24: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
        Integer I = new Integer(12);
                    ^
P45_collection_of_userdefinedclasses.java:26: warning: [removal] Float(float) in Float has been deprecated and marked for removal
        Float f = new Float(123.5F); //F in 123.5F : if F is not there it will convert it to double.
                  ^
Note: P45_collection_of_userdefinedclasses.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
2 warnings

E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P45_collection_of_userdefinedclasses
12
Test
10 sss
123.5
 */