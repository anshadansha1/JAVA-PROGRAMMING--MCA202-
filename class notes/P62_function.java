//PROGRAM : HOW to use PL/SQL function in JAVA

/*

SQL> edit E:\function.sql

FUNCTION -CODE
[[
CREATE OR REPLACE FUNCTION sumtest(n1 IN INT,n2 IN INT)
return INT
IS 
temp INT;
BEGIN 
	temp := n1+n2;
	return temp;
END;
/
]]


SQL> @ E:\function.sql

Function created.
*/

//PROGRAM :Function
import java.sql.*;

public class P62_function {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "mca");

            CallableStatement stmt = con.prepareCall("{?= call sumtest(?,?)}");
            stmt.setInt(2, 10);
            stmt.setInt(3, 43);
            stmt.registerOutParameter(1, Types.INTEGER);
            stmt.execute();
            System.out.println(stmt.getInt(1));
        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }

    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P62_function
53
 */