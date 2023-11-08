/**
 * The Rainfall class.
 * 
 * @author Tyler B
 * @version 1
 */

 
public class Rainfall
{
    public static final int MONTHS_IN_YEAR = 12; 
    private double[] rainForYear = new double[MONTHS_IN_YEAR];
    private String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY"
        , "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
    
    /**
     * No-arg constructor for objects of class Rainfall.
     */
    public Rainfall()
    {
        rainForYear = new double[MONTHS_IN_YEAR];
    }

    /**
     * Rainfall Constructor.
     *
     * @param rain array of rain data
     */
    public Rainfall(double[] rainForYear2)
    {
        for (int i = 0; i < MONTHS_IN_YEAR; i++)
        {
            rainForYear[i] = rainForYear2[i];
        }
    }
    
    /**
     * Method getRainForYear
     *
     * @return The return value
     */
    public double[] getRainForYear()
    {
        return rainForYear;
    }

    /**
     * Method yearlyRainFall.
     *
     * @return total rainfall for the year
     */
    public double yearlyRainFall()
    {
        double total = 0;
        for (int i = 0; i < rainForYear.length; i++)
        {
            total += rainForYear[i];
        }
        return total;
    }

    /**
     * Method avgMonthlyRainFall.
     *
     * @return the average monthly rainfall
     */
    public double avgMonthlyRainFall()
    {
        double total = 0;
        for (int i = 0; i < rainForYear.length; i++)
        {
            total += rainForYear[i];
        }
        return total/rainForYear.length;
    }
    
    /**
     * Method maxMonthIndex.
     *
     * @return the index of the month with the most rain
     */
    public int maxMonthIndex()
    {
        double max = 0;
        int index = 0;
        for (int i = 0; i < rainForYear.length; i++)
        {
            if (rainForYear[i] > max)
            {
                max = rainForYear[i];
            }
        }
        for (int i = 0; i < rainForYear.length; i++)
        {
            if (max == rainForYear[i])
            {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Method maxMonthString.
     *
     * @return the String representation of 
     *      the month that has the most rainfall
     */
    public String maxMonthString()
    {
        return months[maxMonthIndex()];
    }

    /**
     * Method minMonth.
     *
     * @return the index of the month with the least rain
     */
    public int minMonthIndex()
    {
        double min = 999999999;
        int index = 0;
        for (int i = 0; i < rainForYear.length; i++)
        {
            if (rainForYear[i] < min)
            {
                min = rainForYear[i];
            }
        }
        for (int i = 0; i < rainForYear.length; i++)
        {
            if (min == rainForYear[i])
            {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Method minMonthString.
     *
     * @return the String representation of 
     *      the month that has the least rainfall
     */
    public String minMonthString()
    {
        return months[minMonthIndex()];
    }
}
