/*PROGRAM 5_2 : Create a class for employee having eno,ename and esal as data members. 
Provide functions for reading and displaying employee details. 
(Accept information of n employees in the main function, display the same and search for an emp (using eno)). 
*/

import java.util.*;

class Employee {
    int eno;
    String ename;
    double esal;
    public void read(){
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the Employee Number : ");
        eno = s.nextInt();
        s.nextLine();
        System.out.println("\nEnter the Employee Name : ");
        ename = s.nextLine();
        System.out.println("\nEnter the Employee Salary : ");
        esal = s.nextDouble();
    }
    public void disp(){
        System.out.println("\nEmployee Number : "+eno);
        System.out.println("\nEmployee Name : "+ename);
        System.out.println("\nEmployee Salary : "+esal);
    }
}

public class P5_2_employee {
    public static void main(String args[]){
        int n,i;
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter the number of employees : ");
            n = s.nextInt();
            Employee[] emp_array = new Employee[n]; //array of objects

            //Input 
            for( i=0 ;i<n;i++ ){
                emp_array[i] = new Employee();
                System.out.println("\nEnter the details of Employee "+ (i+1)+" -->>" );
                emp_array[i].read(); 
            }

            //Display
            System.out.println("\nEmployee Details -->>");
            for(i=0; i<n ; i++){
                System.out.println("\nDetails of Employee "+(i+1)+" : ");
                emp_array[i].disp();
            }

            //Search for employee
            System.out.println("\nEnter the Employee Number to search for :");
            int search_no = s.nextInt();
            boolean found = false;

            for( i=0 ; i<n ; i++){
                if(emp_array[i].eno == search_no){
                    System.out.println("\nEmployee Found!");
                    System.out.println("\nDetails of Employee -->");
                    emp_array[i].disp();
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("\nEmployee Not Found !");
            }

        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}
