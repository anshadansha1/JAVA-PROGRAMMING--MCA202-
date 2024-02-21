//PROGRAM : Database connection : Select

import java.io.*;
import java.sql.*;


public class P56_db_select {
    public static void main(String args[]){
        Connection con;
        Statement st;
        ResultSet rs;
        try{
            Class.forName("com.mysql.jdbc.Driver");//loads driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db?characterEncoding=utf8","root","");//connection to database
            st = con.createStatement();//to execute sql queries
            String str = "select * from emp";
            rs = st.executeQuery(str); //The result of the query is stored in ResultSet object "rs".
            while(rs.next()){
                System.out.println(rs.getString("eno")+" "+rs.getString("ename")+" "+rs.getString("esal"));
            }
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }    
}

/*OUTPUT :
E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P56_db_select
23 Hrishi 9000
36 Anshad 6000
8642 Sreekumar 7000
 
*/