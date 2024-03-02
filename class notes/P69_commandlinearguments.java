//PROGRAM : Command Lines Arguments(CLA): Arguments which are passed during time of execution.

public class P69_commandlinearguments {
    public static void main(String args[]){
        int i;
        for(i=0 ; i<args.length ; i++){
            System.out.println("\n"+args[i]);
        }
    }    
}

/*
 OUTPUT :
 
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P69_commandlinearguments hi hello

hi

hello
 */