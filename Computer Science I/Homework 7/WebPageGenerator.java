import java.util.Scanner;
import java.io.*;

/**
 * The WebPageGenerator class
 * 
 * @author Tyler B
 * @version 1
 */
public class WebPageGenerator
{
    /**
     * Method main.
     *
     * @param args A parameter
     */
    public static void main(String args[]) throws IOException
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = kb.nextLine();

        System.out.println("Describe yourself: ");
        String des = kb.nextLine();

        PrintWriter file = new PrintWriter("filename.html");
        
        file.println("<html>");
        file.println("<head>");
        file.println("</head>");
        file.println("<body>");
        file.println("\t<center>");
        file.println("\t\t<h1>" + name + "</h1>");
        file.println("\t</center>");
        file.println("\t<hr>");
        file.println("\t\t" + des);
        file.println("\t<hr>");
        file.println("</body>");
        file.println("</html>");

        file.close();
    }
}
