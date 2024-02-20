//PROGRAM :Connection of Database:Delete 
import java.io.*;
import java.util.*;
import java.sql.*;

public class P55_db_delete {
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
            System.out.println("\nEnter eno of employee to delete:");
            no =s.nextInt();

            //delete query
            String str = "delete from emp where eno = "+no;
            System.out.println("\n"+str);
            st.executeUpdate(str);//
            System.out.println("\nOne record is Deleted.");
        }  
        catch(Exception e){
            System.out.println("\nError :"+e);
        }

    }    
}

/*OUTPUT :
E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P55_db_delete

Enter eno of employee to delete:
34

delete from emp where eno = 34

One record is Deleted.
 */
