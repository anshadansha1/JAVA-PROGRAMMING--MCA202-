//PROGRAM : Connecting to Database using a general purpose or a Common class.
import java.sql.*;
import java.io.*;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

class CDatabase{
    Connection con;
    Statement st;
    public CDatabase(String dbname){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname+"?characterEncoding=utf8","root","");
            st = con.createStatement();
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }

    public void idu(String sql){
        try{
            st.executeUpdate(sql);
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
    public ResultSet select(String sql ){
        ResultSet rs = null;
        try{
            rs = st.executeQuery(sql);
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }

        return rs;
    }
}

public class P58_db_generalpurposeclass {
    public static void main(String args[]){
       try {
           CDatabase objDB = new CDatabase("ems_db");
           ResultSet rs = null;
           int no;
           String name;
           float sal;
           Scanner s = new Scanner(System.in);
           System.out.println("\nEnter no : ");
           no = s.nextInt();
           s.nextLine();
           System.out.println("\nEnter Name : ");
           name = s.nextLine();
           System.out.println("\nEnter Salary : ");
           sal = s.nextInt();
           String str = "insert into emp values(";
           str = str + no + ",'";
           str = str + name + "',";
           str = str + sal + ")";
           System.out.println("\n" + str);

           objDB.idu(str); // value passed
           rs = objDB.select("select * from emp");
           while (rs.next()) {
               System.out.println(rs.getString("eno") + " " + rs.getString("ename")+" "+rs.getString("esal"));
       }
       } catch (Exception e) {
            System.out.println("\nError : "+e);
       }
    }
}


/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P58_db_generalpurposeclass

Enter no :
101

Enter Name :
Anshad

Enter Salary :
45000

insert into emp values(101,'Anshad',45000.0)
101 Anshad 45000
 */