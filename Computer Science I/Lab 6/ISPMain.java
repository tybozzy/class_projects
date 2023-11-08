/**
 * ISPMain.java
 * 
 */

import java.util.Scanner;

/**
 * Short, one-line description of ISPMain class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B
 * @version 1
 */
public class ISPMain
{
    //Put instance variables below this line.  
    
    /**
     * Method main.
     *
     * @param args A parameter
     */
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        char pck;
        double hours = 0;
        
        System.out.println("Package A: For $9.95 per month," 
            + "10 hours of access are provided. Additional hours are $2.00 per"
            + "hour.");
        System.out.println("Package B: For $14.95 per month,"
            + "20 hours of access are provided. Additional hours are $1.00 per"
            + "hour.");
        System.out.println("Package C: For $19.95 per month," 
            + "unlimited access is provided.");
            
        System.out.println("Please select a package");
        pck = kb.nextLine().charAt(0);
        
        if (pck != 'C')
        {
            System.out.println("Please enter hours used: ");
            hours = kb.nextDouble();
        }
        
        ISP isp = new ISP(pck, hours);
        System.out.println(isp.calculateCharges());
        System.out.println(isp.printSavings());
    }
    
    /**
     * No parameter constructor for objects of class ISPMain.
     */
    public ISPMain()
    {
        
    }
}
