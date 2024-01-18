import java.io.*;
import java.util.Scanner;

class CThread implements Runnable {
    int m, n;

    public CThread(int a, int b) {
        m = a;
        n = b;
    }

    public void run() {
        while (m != n) {
            System.out.print("\t" + m);
            if (m < n) {
                m++;
            } else {
                m--;
            }
            System.out.println("\t" + m);
        }

    }
}

public class P_disp_thread {
    public static void main(String args[]) {
        CThread t1, t2;
        Thread p, q;
        int m, n;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("\nEnter m : ");
            m = s.nextInt();
            System.out.println("\nEnter n : ");
            n = s.nextInt();
            t1 = new CThread(m, n);
            t2 = new CThread(n, m);
            p = new Thread(t1);
            q = new Thread(t2);

        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }

    }
}
