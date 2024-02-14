
//PROGRAM : ArrayList() ->class in java, in which we can store  same type like int,string,float etc.. 
//ierator :it provides the facility to go through all the elements in the list.
import java.util.*;

public class P44_arraylist {
    public static void main(String args[]) {
        List l;
        l = new ArrayList<>();

        l.add(new Integer(10));
        l.add(new Integer(20));
        l.add(new Integer(30));

        for (Iterator c = l.iterator(); c.hasNext();) {
            System.out.println(c.next());
        }
    }
}

/*OUTPUT :
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>javac P44_arraylist.java
Note: P44_arraylist.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P44_arraylist
10
20
30
 */