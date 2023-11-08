/**
 * Calculates tip gratuity
 * 
 * @author Tyler B 
 * @version 1
 */
import java.util.Scanner;
public class Tips
{
    /**
     * @param args command line arguments (not used)
     */
    public static void main(String[] args)
    {
        float subTotal;
        float rate;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the subtotal: ");
        subTotal = keyboard.nextFloat();
        System.out.println("Please enter the gratuity rate: ");
        rate = keyboard.nextFloat();
        
        System.out.println("Gratuity: $" + ((rate / 100) * subTotal));
        System.out.println("Total: $" + (((rate / 100) * subTotal) + subTotal));
        
        
    }
}