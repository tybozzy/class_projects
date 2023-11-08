/**
 * 
 * Collects info of customer and purchase and calculates total price w/ tax
 *
 * @author Tyler B 
 * @version 1
 */
import java.util.Scanner;
public class SalesTax
{
    /**
     * @param args command line arguments (not used)
     */
    public static void main(String[] args)
    {
        final double stateTax = 0.055;
        final double countyTax = 0.02;
        String name;
        double purch;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();
        
        System.out.println("Please enter your amount of purchase: ");
        purch = keyboard.nextDouble();
        
        System.out.println("Hello, " + name);
        System.out.println("Purchase Amount: $" + purch);
        System.out.println("State Sales Tax: $" + stateTax * purch);
        System.out.println("County Sales Tax: $" + countyTax * purch);
        double x = ((countyTax + stateTax) * purch);
        System.out.println("Total Sales Tax: $" + x);
        System.out.print("Total Sales Amount: $" + (((stateTax + countyTax) 
            * purch) + purch));
    }
}
