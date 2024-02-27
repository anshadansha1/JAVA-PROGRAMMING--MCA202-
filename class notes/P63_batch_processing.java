//PROGRAM : BATCH Processing : Executing a group of sql statements one after another.

import java.sql.*;

public class P63_batch_processing {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "mca");
            con.setAutoCommit(false); // to manage transactions manually
            Statement st = con.createStatement();
            st.addBatch("insert into usertb values(111,'Hari Govind')");
            st.addBatch("insert into usertb values(112,'Albin')");
            st.executeBatch(); // for Batch wise execution
            
            con.commit();
            con.close();
            System.out.println("Records inserted successfully.");
        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }

    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P63_batch_processing

Records inserted successfully.
 */
/*
 OUTPUT -SQL
 SQL> select * from usertb;

        ID NAME
---------- --------------------
         2 Nihal
         3 Majo
      1101 Anshad
       111 Hari Govind
       112 Albin

SQL>
 */