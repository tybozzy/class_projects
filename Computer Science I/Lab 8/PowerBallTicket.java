/**
 * PowerBallTicket.java
 * 
 */


//Put any imports below this line.
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
 
/**
 * Short, one-line description of PowerBallTicket class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B 
 * @version 1.0
 */
public class PowerBallTicket
{   
    /**
     * Method main.
     *
     * @param args A parameter
     */
    public static void main (String args[]) throws IOException
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("What would you like to name the file?");
        String filename = kb.nextLine();
        
        System.out.println("How many tickets would you like?");
        int num = kb.nextInt();
        
        PowerBall pb = new PowerBall();
        
        PrintWriter exe = new PrintWriter(filename);
        
        for (int i = 1; i <= num; i++)
        {
            pb.generateLotteryPicks();
            exe.println(pb.toString());
        }
        
        exe.close();
    }
}
