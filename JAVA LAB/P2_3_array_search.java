//PROGRAM 2_3: WAP to search for a given element in an array.
import java.io.*;

public class P2_3_array_search{

    public static void lsearch(int a[],int n,int s){

            int i,flag=0;
            for(i=0;i<n;i++){
                if(a[i]==s){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("\nElement "+s+" found at index "+ i);
            }
            else{
                System.out.println("\nElement Not found!");
            }
            
    }

    public static void main(String args[]){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        int a[],n,i,s;
        din = new DataInputStream(System.in);
        try{
            System.out.println("\nEnter how many elements to read : ");
            n=Integer.parseInt(din.readLine());
            a =new int[n]; //array initialization
            System.out.println("Enter "+n+" values : ");
            
            for(i=0;i<n;i++){
                a[i]=Integer.parseInt(din.readLine());
            }
            System.out.println("Displaying values : ");
            for(i=0;i<n;i++){
                System.out.println(a[i]);
            }

            //Search part
            System.out.println("\nEnter the element to search : ");
            s=Integer.parseInt(din.readLine());
            lsearch(a,n,s); //calling function
 
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
        
    }
}