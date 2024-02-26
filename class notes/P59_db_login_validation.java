//PROGRAM : LOGIN VALIDATION PROGRAM
import java.io.*;
import java.util.*;
import java.sql.*;

public class P59_db_login_validation {
    public static void main(String args[]){
        Connection con;
        Statement st;
        ResultSet rs;
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter Username : ");
            String username = s.nextLine();
            System.out.println("\nEnter Password : ");
            String password = s.nextLine();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/3306/ems_db?characterEncoding=utf8","root","");
            st = con.createStatement();

            String str = "SELECT * FROM emp WHERE username =  '"+ username + "' AND password = '" + password + "';";
            rs.st.executeQuery(str);

            if(rs.next()){
                System.out.println("\nAuthetication Successfull.Valid Credentials");
            }
            else{
                System.out.println("\nAuthetication Failed.Invalid Credentials!");
            }
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
        finally{
            rs.close();
            st.close();
            con.close();
        }
    }    
}
