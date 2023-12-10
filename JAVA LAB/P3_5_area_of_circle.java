//PROGRAM 3_5 : WAP to calculate area of a circle (functions with no argument and no return type.)
import java.io.*;
public class P3_5_area_of_circle {

    //Function with No argument and No return type
    public static void areaOfcircle(){
        DataInputStream din;
        din = new DataInputStream(System.in);
        double area;
        try{
            System.out.println("\nEnter the radius of circle : ");
            int r = Integer.parseInt(din.readLine());
            area=3.14*(r*r);
            System.out.println("\nArea of circle =  "+area);
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
    public static void main(String[] args){
        System.out.println("\nMuhammad Anshad P A");
        areaOfcircle(); 
        
    }
}
