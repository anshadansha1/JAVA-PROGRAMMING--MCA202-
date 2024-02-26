import java.sql.*;
import java.util.Scanner;

public class TODOList {
    private Connection con;

    public TODOList() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establish connection with MySQL database hosted on WAMP server
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo_db?characterEncoding=utf8", "root", "");
            createTable();
        } catch (Exception e) {
            System.out.println("\nError : "+e);
        }
    }

    private void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS tasks (id INT AUTO_INCREMENT PRIMARY KEY, task TEXT)";
        try {
            Statement st = con.createStatement();
            st.execute(query);
        } catch (Exception e) {
            System.out.println("\nError : "+e);
        }
    }

    public void addTask(String task) {
        String query = "INSERT INTO tasks (task) VALUES (?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, task);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("\nError : "+e);
        }
    }

    public void displayTasks() {
        String query = "SELECT * FROM tasks";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("task"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeTask(int task) {
        String query = "DELETE FROM tasks WHERE id = (?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, task);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("\nError : "+e);
        }
    }

    public static void main(String[] args) {
        TODOList toDoList = new TODOList();
        Scanner s = new Scanner(System.in);
        

        while(true){
            System.out.println("\nTODO LIST----->");
            System.out.println("1. ADD a Task");
            System.out.println("2. View Added Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            int ch = s.nextInt();

            switch(ch){
                case 1:
                    try {
                        System.out.print("\nEnter the task: ");
                        s.nextLine();
                        String task1 = s.nextLine();
                        toDoList.addTask(task1);
                        break;
                    } catch (Exception e) {
                        System.out.println("\nError : " + e);
                    }
                case 2:
                    try {
                        System.out.print("\nALL TASKS: ");
                        toDoList.displayTasks();
                        break;
                    } catch (Exception e) {
                        System.out.println("\nError : " + e);
                    }
                case 3:
                    try {
                        System.out.print("\nEnter the task id: ");
                        int task2 = s.nextInt();
                        toDoList.removeTask(task2);
                        break;
                    } catch (Exception e) {
                        System.out.println("\nError : " + e);
                        }
                case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                default:
                        System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}