//PROGRAM : Prepared Statement : A functionality where you can create a query by using parameters.

import java.sql.*;

public class P60_prepared_statement {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db?characterEncoding=utf8","root","");
            
            PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");//it uses placeholders (?). These placeholders represent parameters that will be filled in later with specific values.
            ps.setInt(1,102);//sets the value for the first placeholder
            ps.setString(2,"Albin");
            ps.setInt(3,50000);

            int i = ps.executeUpdate();

            System.out.println("\n"+i+" Record Inserted");
            con.close();

        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}

/*
 * OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P60_prepared_statement

1 Record Inserted
 */