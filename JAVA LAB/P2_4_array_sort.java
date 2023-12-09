//PROGRAM 2_4: WAP to sort elements in an array in ascending order.
import java.io.*;

public class P2_4_array_sort{
    public static void sortarr(int a[],int n){
        int i,j,temp;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\nSorted Successfully");
    }
    public static void disp(int a[],int n){
        int i;
        System.out.println("\nDisplaying array values  : ");
            for(i=0;i<n;i++){
                System.out.println(a[i]);
            }
    }
    public static void main(String args[]){
        System.out.println("Muhammad Anshad P A");
        DataInputStream din;
        int a[],n,i;
        din =new DataInputStream(System.in);
        try{
            System.out.println("\nEnter how many elements to read : ");
            n =Integer.parseInt(din.readLine());
            a = new int[n];//array
            System.out.println("Enter "+n+" values : ");
            for(i=0;i<n;i++){
                a[i]=Integer.parseInt(din.readLine());
            }
            disp(a,n);
            sortarr(a,n);
            disp(a,n);

        }
        catch(Exception e){
            System.out.println("Erorr : "+ e);
        }
    }
}