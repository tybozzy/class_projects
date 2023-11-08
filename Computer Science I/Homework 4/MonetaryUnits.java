import java.util.Scanner;
/**
 * The MonetaryUnits class.
 *
 * @author Tyler B 
 * @version V.1
 */
public class MonetaryUnits
{
    //Put instance variables below this line.  
    static double money;
    int n;
    int dollars;
    int quarters;
    int dimes;
    int nickels;
    int pennies;
    Scanner kb = new Scanner(System.in);
    /**
     * Main method.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        double money;
        int n;
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter an amount in double for dollars: $");
        money = kb.nextDouble();

        n = (int)(money * 100);
        
        dollars = n / 100;
        n %= 100;
        
        quarters = n / 25;
        n %= 25;
        
        dimes = n / 10;
        n %= 10;
        
        nickels = n / 5;
        n %= 5;
        
        pennies = n / 1;
        n %= 1;

        System.out.printf("Your amount $%.2f consists of:\n", money);
        System.out.printf("\t%-3d dollars\n", dollars);
        System.out.printf("\t%-3d quarters\n", quarters);
        System.out.printf("\t%-3d dimes\n", dimes);
        System.out.printf("\t%-3d nickels\n", nickels);
        System.out.printf("\t%-3d pennies", pennies);
    }
}
