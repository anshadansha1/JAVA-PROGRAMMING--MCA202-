//PROGRAM : Built In Class : URL

import java.net.URL;

public class P71_url_builtinclass {
    public static void main(String args[]) {
        try {

            URL url = new URL(args[0]);
            System.out.println("\nURL is : " + url.toString());
            System.out.println("\nProtocol is : " + url.getProtocol());
            System.out.println("\nFile Name is : " + url.getFile());
            System.out.println("\nHost is : " + url.getHost());
            System.out.println("\nPath is : " + url.getPath());
            System.out.println("\nPort is : " + url.getPort());
            System.out.println("\nDefault Port is : " + url.getDefaultPort());
        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }
    }
}
/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P71_url_builtinclass https://localhost:1234/test.jsp

URL is : https://localhost:1234/test.jsp

Protocol is : https

File Name is : /test.jsp

Host is : localhost

Path is : /test.jsp

Port is : 1234

Default Port is : 443
-------------------------------------------------------------

E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P71_url_builtinclass https://rajagiri.edu/

URL is : https://rajagiri.edu/

Protocol is : https

File Name is : /

Host is : rajagiri.edu

Path is : /

Port is : -1

Default Port is : 443
 */
