import java.io.*;

public class P1_sum
{
	public static void main(String args[])
	{
		DataInputStream din;
		int a,b;
		String s;
		din= new DataInputStream(System.in);
		
		try{
			System.out.println("Enter first number : ");
			s= din.readLine();
			a= Integer.parseInt(s);
			System.out.println("Enter the second number : ");
			s= din.readLine();
			b= Integer.parseInt(s);
			System.out.println("Sum of two numbers is =  "+(a+b));
			
		}
		catch(Exception e){
			System.out.println("Error : "+ e);
		}
	}
	
}