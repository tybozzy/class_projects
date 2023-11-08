import java.util.Scanner;
/**
 * The Driver class.
 * 
 * This class demostrates the DistanceTraveled class.
 * 
 * @author Tyler B 
 * @version 1
 */
public class Driver
{
   /**
     * Main method.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please enter the speed: ");
        int speed = kb.nextInt();
        
        while (speed < 0)
        {
            System.out.println("Cannot enter negative speed.");
            System.out.println("Please enter the speed: ");
            speed = kb.nextInt();
        }
        
        System.out.println("Please enter the time in hours: ");
        int hours = kb.nextInt();
        
        while (hours < 1)
        {
            System.out.println("Cannot enter less than one hour.");
            System.out.println("Please enter the time in hours: ");
            hours = kb.nextInt();
        }
        
        
        System.out.println("Hour\tDistance Traveled");
        for (int i = 1; i <= hours; i++)
        {
            DistanceTraveled dt = new DistanceTraveled(i, speed);
            System.out.printf("%-7d %-8d\n", i, dt.getDistance());
        }
    }
}






