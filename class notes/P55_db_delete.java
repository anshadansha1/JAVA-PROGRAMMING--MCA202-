//PROGRAM :Connection of Database:Insert 
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
            con = DriverManager.getConnection("jdbc:mysql://local:3306/ems_db?characterEncoding=utf8","root","");//create a connection to the database specified in the URL 
            st = con.createStatement(); //creates a 'Statement' object that can be used to execute SQL queries against the database.
            System.out.println("\nEnter no,name and Salary :");
            no =s.nextInt();
            s.nextLine();
            name = s.nextLine();
            sal = s.nextFloat();

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
