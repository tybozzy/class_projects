//September 9, 2022
/**
 * Calculates profit from a sale with constant percentage of 25%
 *
 * @author Tyler B
 * @version 1
 */
public class Profit
{
    /**
     * Main method.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args)
    {
        final double percent = 0.25;
        double retailPrice = 72.95;
        double profit = retailPrice * percent;
        System.out.print("The profit from sale: " + profit);
    }
}