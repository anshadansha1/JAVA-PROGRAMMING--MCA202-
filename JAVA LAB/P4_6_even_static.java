import java.util.*;
public class P4_6_even_static {

    public static void evennum(int n){
        int i;
        for(i =1;i<n;i++){
            if(i%2 == 0){
                System.out.println("\t"+i);
            }
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("\nEnter the limit(n) : ");
            int n = s.nextInt();
            evennum(n);
        }
        catch(Exception e){
            System.out.println("\nError : "+e);
        }
    }
}
