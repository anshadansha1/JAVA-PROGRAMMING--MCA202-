//PROGRAM : Synchronization Problem Solution in Threading.
//->Synchronization Prolem is solved by keyword "synchronized"

class Callme{
    public synchronized void call(String str){ 
        System.out.println("\n["+str);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Error : "+e);
        }
        System.out.println("]");
    } 
}

class TCall implements Runnable{
    String str;
    Callme c;
    Thread t;
    public TCall(String s,Callme cc){
        str = s;
        c = cc;
        t = new Thread(this);
        t.start(); // start() will create a thread
    }

    public void run(){ //A thread will always start its execution fron run() method.
        c.call(str);
    }
}
public class P48_synchronization_problem {
    public static void main(String args[]){
        Callme c = new Callme();
        TCall p,q,r;
        p = new TCall("Hello",c);
        q = new TCall("World",c);
        r = new TCall("Good Day",c);
        try{
            p.t.join(); //All the Parent process will wait till all the Child process have completed its execution.
            q.t.join();
            r.t.join();
        }
        catch(InterruptedException e){
            System.out.println("\nError : "+e);
        }
    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P48_synchronization_problem

[Hello
]

[Good Day
]

[World
]

 */