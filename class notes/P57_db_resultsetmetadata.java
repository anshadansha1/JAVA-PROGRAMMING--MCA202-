//PROGRAM : Database connection : ResultSetMetaData
import java.sql.*;
import java.util.*;
public class P57_db_resultsetmetadata {
    public static void main(String args[]){
        Connection con;
        Statement st;
        ResultSet rs;
        ResultSetMetaData rd; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_db?characterEncoding=utf8","root","");
            st = con.createStatement();//to execute sql queries
            String str = "select ename,esal from emp";
            rs =st.executeQuery(str);
            rd =rs.getMetaData(); //contains info about the columns in the result set such as the number of columns, their types, labels, etc.

            int cc = rd.getColumnCount(); //retrieves the no.of columns in the resultSetMetadata object "rd".
            int i;

            for(i = 1; i <= cc ; i++){
                System.out.print(rd.getColumnName(i)+"\t");
            }
            System.out.print("\n");
            while(rs.next()){
                for(i=1;i<=cc;i++){
                    System.out.print(rs.getString(i)+"\t");
                }
                System.out.print("\n");
            }
        
            

        } 
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P57_db_resultsetmetadata
ename   esal
Hrishi  9000
Anshad  6000
Sreekumar       7000
 */