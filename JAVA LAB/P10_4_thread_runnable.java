/*PROGRAM 10_4:Write a program to illustrate creation of threads using runnable interface.
 (start method start each of the newly created thread. Inside the run method there is sleep() 
 for suspend the thread for 500 milliseconds). 
Main thread should wait until all the other thread terminates its execution (using join()). */

import java.util.Scanner;

class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running.");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class P10_4_thread_runnable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();
        scanner.close();
        
        Thread[] threads = new Thread[numThreads];
        
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new MyRunnable());
            threads[i].start();
        }
        
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("All threads have terminated.");
    }
}