//PROGRAM : Stored Procedure :are prepared SQL code that you save so you can reuse it over and over again
//CREATE TABLE usertb(id int(10),name varchar(20));
/*
 PROCEDURE -CODE:
------------------
SQL> edit E:\plsql_ans\procedures.sql
[[
CREATE OR REPLACE PROCEDURE userinsert(id IN INT,name IN VARCHAR)
IS
BEGIN
insert into usertb values(id,name);
END;
]]

SQL> @ E:\plsql_ans\procedures.sql

Procedure created.

SQL> exec userinsert(1,'Anshad Muhammad');

PL/SQL procedure successfully completed.

SQL> select * from usertb;

        ID NAME
---------- --------------------
         1 Anshad Muhammad

SQL>
 */

//PROGRAM :Java program to invoke procedure -ORACLE SQL
import java.sql.*;

public class P61_stored_procedure {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "mca");
            CallableStatement stmt = con.prepareCall("{call userinsert(?,?)}"); // to call the stored procedure userinsert with two parameters.

            stmt.setInt(1, 1101);
            stmt.setString(2, "Anshad");
            stmt.executeUpdate();
            System.out.println("\nSuccess");
        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }

    }
}


/*
 OUTPUT :
 SQL> select * from usertb;

        ID NAME
---------- --------------------
         2 Nihal
         3 Majo
      1101 Anshad

 */