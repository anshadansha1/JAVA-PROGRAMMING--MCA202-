//PROGRAM : 5)throws

//NOTE:[You can have a "try{}" block without a "catch(){}" block , But atleast you need to have a "finally{}" block].

import java.io.*;

class CArray {
    int a[], n;

    public void readArray() throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException {
        DataInputStream din = new DataInputStream(System.in);
        String s;
        System.out.println("Enter the number of elements in array(n):");
        s = din.readLine();
        n = Integer.parseInt(s);
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter a [" + i + "]");
            s = din.readLine();
            a[i] = Integer.parseInt(s);
        }
    }

    public void dispArray() throws ArrayIndexOutOfBoundsException {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

public class P24_USE_throws {
    public static void main(String args[]) {
        try {
            CArray obj = new CArray();
            obj.readArray();
            obj.dispArray();
        } catch (IOException e1) {
            System.out.println(e1);
        } catch (NumberFormatException e2) {
            System.out.println(e2);
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println(e3);
        } catch (Exception e4) {
            System.out.println(e4);
        }
    }
}

/*
 * OUTPUT :
 * E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P24_USE_throws
 * Enter the number of elements in array(n):
 * 3
 * 
 * Enter a [0]
 * 5
 * 
 * Enter a [1]
 * 3
 * 
 * Enter a [2]
 * 7
 * 5
 * 3
 * 7
 */