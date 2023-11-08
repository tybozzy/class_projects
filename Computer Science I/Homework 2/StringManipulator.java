/**
 * Manipulutes a given string
 * 
 * @author Tyler B
 * @version 1
 */
public class StringManipulator
{
    /**
     * @param args command line arguments (not used)
     */
    public static void main(String[] args)
    {
        String city = "Chicago";
        
        System.out.println(city.length());
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.charAt(0));
    }
}