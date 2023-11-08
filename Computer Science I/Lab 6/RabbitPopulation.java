/**
 * RabbitPopulation.java
 * 
 */

/**
 * Short, one-line description of RabbitPopulation class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B
 * @version 1.0
 */
public class RabbitPopulation
{
    private int initialPopulation;
    private int sixMonthPopulation;
    
    /**
     * No parameter constructor for objects of class RabbitPopulation.
     */
    public RabbitPopulation()
    {
        initialPopulation = 0;
        sixMonthPopulation = 0;
    }
    
    /**
     * RabbitPopulation Constructor.
     *
     * @param initialPop A parameter
     * @param sixMonthPop A parameter
     */
    public RabbitPopulation(int initialPop, int sixMonthPop)
    {
        if (initialPop >= 0)
        {
            initialPopulation = initialPop;
        }
        else
        {
            initialPopulation = 0;
        }
        if (sixMonthPop >= 0)
        {
            sixMonthPopulation = sixMonthPop;
        }
        else
        {
            sixMonthPopulation = 0;
        }
    }
    
    /**
     * Method setInitialPopulation.
     *
     * @param newInitialPopulation A parameter
     */
    public void setInitialPopulation(int newInitialPopulation)
    {
        if (newInitialPopulation >= 0)
        {
            initialPopulation = newInitialPopulation;
        }
        else
        {
            initialPopulation = 0;
        }
    }
    
    /**
     * Method setSixMonthPopulation.
     *
     * @param newSixMonthPopulation A parameter
     */
    public void setSixMonthPopulation(int newSixMonthPopulation)
    {
        if (newSixMonthPopulation >= 0)
        {
            sixMonthPopulation = newSixMonthPopulation;
        }
        else
        {
            sixMonthPopulation = 0;
        }
    }
    
    /**
     * Method getInitialPopulation.
     *
     * @return The return value
     */
    public int getInitialPopulation()
    {
        return initialPopulation;
    }
    
    /**
     * Method getSixMonthPopulation.
     *
     * @return The return value
     */
    public int getSixMonthPopulation()
    {
        return sixMonthPopulation;
    }
    
    /**
     * Method calculateGrowthRate.
     *
     * @return The return value
     */
    public double calculateGrowthRate()
    {
        double x = (getSixMonthPopulation() - getInitialPopulation());
        return (x / getInitialPopulation());
    }
    
    /**
     * Method calculate12MonthPopulation.
     *
     * @return The return value
     */
    public int calculate12MonthPopulation()
    {
        double x = getSixMonthPopulation() * (calculateGrowthRate() + 1);
        
        return (int)Math.round(x);
    }

}
