
import java.net.*;
import java.io.*;
import java.util.Date;

public class sample2 {
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
