import java.util.Scanner;
import java.sql.*;

class FeeManagementSystem {

    public static void main(String args[]) {
        Connection con;
        Statement st;
        ResultSet rs;
        int studentId;
        String studentName;
        double feeAmount;
        Scanner scanner = new Scanner(System.in);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");//Load JDBC Driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fees_db?characterEncoding=utf8", "root", "");//Connection
            st = con.createStatement();
            int choice;
            do{
                System.out.println("\n------ Student FEE Management MENU ------");
            System.out.println("\n1. Add Fee Record");
            System.out.println("2. Retrieve Fee Balance");
            System.out.println("3. Make Payment");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.println("\nEnter Student ID : ");
                    studentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("\nEnter Student Name : ");
                    studentName = scanner.nextLine();
                    System.out.println("\nEnter Student Fee Amount : ");
                    feeAmount = scanner.nextDouble();
                    String insertQuery = "INSERT INTO fees (student_id, student_name, fee_amount) VALUES (" + studentId + ", '" + studentName + "', " + feeAmount + ")";
                    st.executeUpdate(insertQuery);
                    System.out.println("Fee Record Added Successfully.");
                    break;
                case 2:
                    System.out.println("\nEnter Student ID to retrieve fee balance:");
                    studentId = scanner.nextInt();
                    String selectQuery = "SELECT fee_amount FROM fees WHERE student_id = " + studentId;
                    rs = st.executeQuery(selectQuery);
                    if (rs.next()) {
                        double balance = rs.getDouble("fee_amount");
                        System.out.println("\nFee Balance for Student ID " + studentId + ": $" + balance);
                    } else {
                        System.out.println("\nNo fee record found for Student ID " + studentId);
                    }
                    break;
                case 3:
                    System.out.println("\nEnter Student ID and Payment Amount:");
                    studentId = scanner.nextInt();
                    double paymentAmount = scanner.nextDouble();
                    String updateQuery = "UPDATE fees SET fee_amount = fee_amount - " + paymentAmount + " WHERE student_id = " + studentId;
                    int rowsUpdated = st.executeUpdate(updateQuery);
                    if (rowsUpdated > 0) {
                        System.out.println("\nPayment Successful.");
                    } else {
                        System.out.println("\nPayment Failed. Invalid Student ID or Insufficient Balance.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                }
            }
            while (choice!=4); 
                
        
            
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
