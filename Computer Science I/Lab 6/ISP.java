/**
 * ISP.java
 * 
 */



/**
 *
 * Simulates calculating an Internet Service Provider's
 * package rates based off of hourly usage and calculates
 * money savings for respective packages
 * 
 * @author Tyler B
 * @version 1
 */
public class ISP
{
    //Put instance variables below this line.  
    private char pkg;
    private double hoursUsed;

    /**
     * No parameter constructor for objects of class ISP.
     */
    public ISP()
    {
        pkg = 'A';
        hoursUsed = 0;
    }

    /**
     * ISP Constructor.
     *
     * @param getPkg A parameter
     * @param getHoursUsed A parameter
     */
    public ISP(char getPkg, double getHoursUsed)
    {
        pkg = getPkg;
        hoursUsed = getHoursUsed;
    }

    /**
     * Method getPkg.
     *
     * @return pkg
     */
    public char getPkg()
    {
        return pkg;
    }

    /**
     * Method getHoursUsed.
     *
     * @return hoursUsed
     */
    public double getHoursUsed()
    {
        return hoursUsed;
    }

    /**
     * Method setHoursUsed.
     *
     * @param newHours A parameter
     */
    public void setHoursUsed(double newHours)
    {
        hoursUsed = newHours;
    }

    /**
     * Method setPkg.
     *
     * @param newPkg newPkg
     */
    public void setPkg(char newPkg)
    {
        pkg = newPkg;
    }

    /**
     * Method costA.
     *
     * @return cost of package A
     */
    public double costA()
    {
        if (hoursUsed > 10)
        {
            return 9.95 + ((hoursUsed - 10) * 2);
        }
        else
        {
            return 9.95;
        }
    }

    /**
     * Method costB.
     *
     * @return cost of package B
     */
    public double costB()
    {
        if (hoursUsed > 20)
        {
            return 14.95 + (hoursUsed - 20);
        }
        else
        {
            return 14.95;
        }
    }

    /**
     * Method costC.
     *
     * @return cost of package C
     */
    public double costC()
    {
        return 19.95;
    }

    /**
     * Method calculateCharges.
     *
     * @return total package cost
     */
    public double calculateCharges()
    {
        switch (pkg)
        {
            case 'A':
                if (hoursUsed > 10)
                {
                    return 9.95 + ((hoursUsed - 10) * 2);
                }
                else
                {
                    return 9.95;
                }
            case 'B':
                if (hoursUsed > 20)
                {
                    return 14.95 + Math.abs(hoursUsed - 20);
                }
                else
                {
                    return 14.95;
                }
            case 'C':
                return 19.95;
            default:
                return 0;
        }            
    }

    /**
     * Method printSavings.
     *
     * @return nothing, prints to CLI
     */
    public double printSavings()
    {
        switch (pkg)
        {
            case 'A':
                if (costA() > costB())
                {
                    System.out.printf("You would have saved $%.2f" 
                        + " by choosing package B\n", costA() - costB());
                    return 0;
                }
                
                if (costA() > costC())
                {
                    System.out.printf("You would have saved $%.2f" 
                        + " by choosing package C\n", costA() - costC());
                    return 0;
                }
            case 'B':
                if (costB() > costC())
                {
                    System.out.printf("You would have saved $%.2f" 
                        + " by choosing package C", costB() - costC());
                    return 0;
                }
                
                if (costB() > costA())
                {
                    System.out.printf("You would have saved $%.2f" 
                        + " by choosing package A\n", costA() - costB());
                }
            default:
                System.out.println("error");
        }
        return 0;
    }
}
