/*PROGRAM 10_1 : Write a Java program to create two threads: One for displaying all odd number between 1 and 100 and second thread
 for displaying all even numbers between 1 and 100. Create a multithreaded program by creating a subclass of Thread and then creating,
  initializing, and starting two Thread objects from your class. 
The threads will execute concurrently Main thread should wait until all the other thread terminates its execution(using join()). */
class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers between 1 and 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers between 1 and 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class P10_1_threads {
    public static void main(String[] args) {
        Thread oddThread = new OddThread();
        Thread evenThread = new EvenThread();
        oddThread.start();
        evenThread.start();
        try{
        oddThread.join();
        evenThread.join();
        }catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}