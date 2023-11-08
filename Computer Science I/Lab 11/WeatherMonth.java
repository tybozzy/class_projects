/**
 * WeatherMonth.java
 * 
 */

//Put any imports below this line.
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Short, one-line description of WeatherMonth class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B
 * @version 1.0
 */
public class WeatherMonth
{
    private int[] maxTemperature;
    private String monthName;
    private int daysInMonth;
    private int[] minTemperature;
    
    /**
     * WeatherMonth Constructor.
     *
     */
    public WeatherMonth()
    {
        monthName = "January";
        daysInMonth = 31;
        maxTemperature = new int[daysInMonth];
        Arrays.fill(maxTemperature, -999);
        minTemperature = new int[daysInMonth];
        Arrays.fill(minTemperature, -999);
    }
    
    /**
     * WeatherMonth Constructor.
     *
     * @param monthTitle A parameter
     * @param daysInMon A parameter
     */
    public WeatherMonth(String monthTitle, int daysInMon)
    {
        monthName = monthTitle;
        daysInMonth = daysInMon;
        maxTemperature = new int[daysInMon];
        Arrays.fill(maxTemperature, -999);
        minTemperature = new int[daysInMonth];
        Arrays.fill(minTemperature, -999);
    }
    
    /**
     * Method getMaxTemperature.
     *
     * @return The return value
     */
    public int[] getMaxTemperature()
    {
        return maxTemperature;
    }
    
    /**
     * Method getMonthName.
     *
     * @return The return value
     */
    public String getMonthName()
    {
        return monthName;
    }
    
    /**
     * Method getDaysInMonth.
     *
     * @return The return value
     */
    public int getDaysInMonth()
    {
        return daysInMonth;
    }
    
    /**
     * Method setMonthName.
     *
     * @param newMonthName A parameter
     */
    public void setMonthName(String newMonthName)
    {
        if (newMonthName != null)
        {
            monthName = newMonthName;
        }
    }
    
    /**
     * Method setDaysInMonth.
     *
     * @param newDaysInMonth A parameter
     */
    public void setDaysInMonth(int newDaysInMonth)
    {
        daysInMonth = newDaysInMonth;
    }
    
    /**
     * Method setMaxTemperature.
     *
     * @param newMaxTemperature A parameter
     */
    public void setMaxTemperature(int[] newMaxTemperature)
    {
        maxTemperature = newMaxTemperature;
    }
    
    /**
     * Method setDayMaxTemp.
     *
     * @param dayOfMonth A parameter
     * @param temperature A parameter
     */
    public void setDayMaxTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            maxTemperature[dayOfMonth - 1] = temperature;
        }
    }
    
    /**
     * Method displayWeatherMonth.
     *
     */
    public void displayWeatherMonth()
    {
        System.out.println(monthName);
        System.out.println("Day\tMax\tMin");
        for (int i = 0; i < maxTemperature.length; i++)
        {
            System.out.println(i + 1 + "\t" + maxTemperature[i] + "\t" 
                + minTemperature[i]);
        }
    }
    
    /**
     * Method readMaxTempFile.
     *
     * @param filename A parameter
     * @throws IOException just because lol
     */
    public void readMaxTempFile(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNext())
        {
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            
            setDayMaxTemp(n, t);
        }
        scanner.close();
    }
    
    /**
     * Method toString.
     *
     * @return The return value
     */
    public String toString()
    {
        String x = "";
        x +=  String.format("%s\n", monthName);
        x += String.format("%3s%9s%10s\n", "Day", "Max", "Min");
        
        for (int i = 0; i < maxTemperature.length; i++)
        {
            if (maxTemperature[i] == -999 && minTemperature[i] == -999)
            {
                x += String.format("%2d%10s%10s\n", i 
                    + 1, "N/A", "N/A");
            }
            if (maxTemperature[i] != -999 && minTemperature[i] == -999)
            {
                x += String.format("%2d%10d%10s\n", i 
                    + 1, maxTemperature[i], "N/A");
            }
            if (maxTemperature[i] != -999 && minTemperature[i] != -999)
            {
                x += String.format("%2d%10d%10d\n", i 
                    + 1, maxTemperature[i], minTemperature[i]);
            }
            if (maxTemperature[i] == -999 && minTemperature[i] != -999)
            {
                x += String.format("%2d%10s%10d\n", i 
                    + 1, "N/A", minTemperature[i]);
            }
        }
        return x;
    }
    
    /**
     * Method getMinTemperature.
     *
     * @return The return value
     */
    public int[] getMinTemperature()
    {
        return minTemperature;
    }
    
    /**
     * Method setMinTemperature.
     *
     * @param newMinTemperature A parameter
     */
    public void setMinTemperature(int[] newMinTemperature)
    {
        minTemperature = newMinTemperature;
    }
    
    /**
     * Method setDayMinTemp.
     *
     * @param dayOfMonth A parameter
     * @param temperature A parameter
     */
    public void setDayMinTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            minTemperature[dayOfMonth - 1] = temperature;
        }
    }
    
    /**
     * Method readMinTempFile.
     *
     * @param filename A parameter
     * @throws IOException just because again
     */
    public void readMinTempFile(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNext())
        {
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            
            setDayMinTemp(n, t);
        }
        scanner.close();
    }
}
