
//PROGRAM : How to download a file from internet :Using two classes -> 1.URL 2.URLConnection
//InputStream : To read the  content
import java.net.*;
import java.io.*;
import java.util.Date;

public class P72_downloadfilefrominternet {
    public static void main(String args[]) {
        try {
            int c;
            URL u = new URL("https://www.deyeshigh.co.uk/downloads/literacy/world_book_day/roald_dahl_s_tales_of_the_unexpected.pdf");
            URLConnection uc = u.openConnection();
            System.out.println("\nDate : " + new Date(uc.getDate()));
            System.out.println("\nContent-Type : " + uc.getContentType());
            System.out.println("\nExpires : " + uc.getExpiration());
            System.out.println("\nLast-Modified : " + new Date(uc.getLastModified()));

            int len = uc.getContentLength();
            System.out.println("\nContent-Length : " + len);
            if (len > 0) {
                FileOutputStream fout = new FileOutputStream("downloaded_pdf.pdf");
                System.out.println("\n---Content---");
                InputStream input = uc.getInputStream();

                int i = 0;
                while (((c = input.read()) != -1) && (i < len)) {
                    fout.write((char) c);
                    // System.out.println((char)c);
                    i++;
                }
                input.close();
                fout.close();
            } else {
                System.out.println("\nNo content Available !");
            }
        } catch (Exception e) {
            System.out.println("\nError : " + e);
        }
    }
}

/*
 OUTPUT :
 E:\MCA\SEM 2\JAVA PROGRAMMING (MCA202)\class notes>java P72_downloadfilefrominternet

Date : Sat Mar 02 11:08:25 IST 2024

Content-Type : application/pdf

Expires : 0

Last-Modified : Wed Mar 31 16:21:35 IST 2021

Content-Length : 509103

---Content---
----------------------------------------------
 file named downloaded_pdf.pdf is created
 */