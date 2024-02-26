//PROGRAM : Connecting to Database using a general purpose or a Common class.
import java.sql.*;
import java.io.*;
import java.util.*;

class CDatabase{
    Connection con;
    Statement st;
    public CDatabase(String dbname){
        try{
            Class.forName("com.mysql.jdbc,driver");
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
}

public class P58_db_generalpurposeclass {
    public static void main(String args[]){
       
    }
}
