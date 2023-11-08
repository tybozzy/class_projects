import java.util.Scanner;
/**
 * The SumOfNumbers class.
 * 
 * This class asks the user for a positive nonzero integer value. 
 * The program should use a loop to get the sum of all the integers 
 * from 1 up to the number entered.
 *
 * @author Tyler B
 * @version 1
 */
public class SumOfNumbers
{
    /**
     * Main method.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        int x = 0;
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please enter a positive integer: ");
        int num = kb.nextInt();
        
        while (num <= 1)
        {
            System.out.println("That is not a positive integer!");
            System.out.println("Please enter a positive integer: ");
            num = kb.nextInt();
        }
        
        for (int i = 1; i <= num; i++)
            {
                x += i;
            }
        System.out.println(x);
    }
}
