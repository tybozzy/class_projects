/**
 * The Conversion class.
 * 
 * @author Tyler B 
 * @version 1
 */
public class Conversion
{
    /**
     * Method main.
     *
     * @param args A parameter
     */
    public static void main(String args[])
    {
        System.out.println("Centigrade\tFahrenheit");
        System.out.println("-----------------------------");
        for (int i = 0; i <= 20; i++)
        {
            System.out.printf("%d\t\t%.2f\n", i, ((9.0/5.0) * i) + 32.0);
        }
    }
}
