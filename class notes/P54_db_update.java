//PROGRAM :Connection of Database:Update
import java.io.*;
import java.util.*;
import java.sql.*;

public class P54_db_update {
    public static void main(String args[]){
        Connection con;
        Statement st;

        int no;
        String name;
        float sal;
        Scanner s = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");//loads the MySQL JDBC (Java Database Connectivity) driver class into memory
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db?characterEncoding=utf8","root","");//create a connection to the database specified in the URL 
            st = con.createStatement(); //creates a 'Statement' object that can be used to execute SQL queries against the database.
            System.out.println("\nEnter no,name and Salary to update :");
            no =s.nextInt();
            s.nextLine();
            name = s.nextLine();
            sal = s.nextFloat();
            //update query
            String str = "update emp set ename ='";
            str = str + name + "',esal=";
            str = str + sal +" where eno ="+no;
            System.out.println("\n"+str);

            st.executeUpdate(str);//
            System.out.println("\nOne record is Updated.");
        }  
        catch(Exception e){
            System.out.println("\nError :"+e);
        }

    }    
}

/*OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P54_db_update

Enter no,name and Salary :
23
Hrishi
9000

update emp set ename ='Hrishi',esal=9000.0 where eno =23

One record is Updated.

 */