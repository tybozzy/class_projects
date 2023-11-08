/**
 * WeatherComputation.java
 * 
 */

/**
 * Short, one-line description of WeatherComputation class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B 
 * @version 1
 */
public class WeatherComputation
{
    /**
     * Method averageTemperature.
     *
     * @param temperatures A parameter
     * @return The return value
     */
    public static double averageTemperature(int[] temperatures)
    {
        double total = 0;
        double count = 0;
        for (int i = 0; i < temperatures.length; i++)
        {
            if (temperatures[i] != -999)
            {
                total += temperatures[i];
                count++;
            }
        }
        return (total / count);
    }
    
    /**
     * Method highestTemperature.
     *
     * @param temperatures A parameter
     * @return The return value
     */
    public static int highestTemperature(int[] temperatures)
    {
        int max = 0;
        for (int i = 0; i < temperatures.length; i++)
        {
            if (temperatures[i] != -999)
            {
                if (temperatures[i] > max)
                {
                    max = temperatures[i];
                }
            }
        }
        return max;
    }
    
    /**
     * Method lowestTemperature.
     *
     * @param temperatures A parameter
     * @return The return value
     */
    public static int lowestTemperature(int[] temperatures)
    {
        int min = 9999999;
        for (int i = 0; i < temperatures.length; i++)
        {
            if (temperatures[i] != -999)
            {
                if (temperatures[i] < min)
                {
                    min = temperatures[i];
                }
            }
        }
        return min;
    }
    
    /**
     * Method numberMissing.
     *
     * @param temperatures A parameter
     * @return The return value
     */
    public static int numberMissing(int[] temperatures)
    {
        int count = 0;
        for (int i = 0; i < temperatures.length; i++)
        {
            if (temperatures[i] == -999)
            {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Method hdd.
     *
     * @param max A parameter
     * @param min A parameter
     * @return The return value
     */
    public static double hdd(int max, int min)
    {
        double tAverage = (max + min) / 2.0;
        if (max == -999 || min == -999 || max < min)
        {
            return 0.0;
        }
        if (tAverage < 65.0)
        {
            return 65.0 - tAverage;
        }
        return 0.0;
    }
    
    /**
     * Method cdd.
     *
     * @param max A parameter
     * @param min A parameter
     * @return The return value
     */
    public static double cdd(int max, int min)
    {
        double tAverage = (max + min) / 2.0;
        if (max == -999 || min == -999 || max < min)
        {
            return 0.0;
        }
        if (tAverage > 65.0)
        {
            return tAverage - 65.0;
        }
        return 0.0;
    }
    
    /**
     * Method monthHdd.
     *
     * @param max A parameter
     * @param min A parameter
     * @return The return value
     */
    public static double monthHdd(int[] max, int[] min)
    {
        double x = 0;
        for (int i = 0; i < max.length; i++)
        {
            x += hdd(max[i], min[i]);
        }
        
        return x;
    }
    
    /**
     * Method monthCdd.
     *
     * @param max A parameter
     * @param min A parameter
     * @return The return value
     */
    public static double monthCdd(int[] max, int[] min)
    {
        double x = 0;
        for (int i = 0; i < max.length; i++)
        {
            x += cdd(max[i], min[i]);
        }
        
        return x;
    }
}
