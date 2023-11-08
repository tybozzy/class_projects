import java.util.HashMap;
/**
 * The Month class.
 * 
 * This program has one field, three constructors,
 * one mutator method, two accessor methods, a
 * toString method, an equals method,.
 *
 * @author Tyler B 
 * @version 1
 */
public class Month
{
    private int monthNumber;
    
    /**
     * Month Constructor.
     *
     */
    public Month()
    {
        monthNumber = 1;
    }
    
    /**
     * Month Constructor.
     *
     * @param monthNum A parameter
     */
    public Month(int monthNum)
    {
        if (monthNum >= 1 && monthNum <= 12)
        {
            monthNumber = monthNum;
        }
        else
        {
            monthNumber = 1;
        }
    }
    
    /**
     * Month Constructor.
     *
     * @param month A parameter
     */
    public Month(String month)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        
        monthNumber = map.get(month);
    }
    
    /**
     * Method setMonthNumber.
     *
     * @param newMonth A parameter
     */
    public void setMonthNumber(int newMonth)
    {
        if (newMonth >= 1 && newMonth <= 12)
        {
            monthNumber = newMonth;
        }
        else
        {
            monthNumber = 1;
        }
    }
    
    /**
     * Method getMonthNumber.
     *
     * @return The return value
     */
    public int getMonthNumber()
    {
        return monthNumber;
    }
    
    /**
     * Method getMonthName.
     *
     * @return The return value
     */
    public String getMonthName()
    {
        String[] monthName = {"January", "February", "March", "April", "May", "June"
            , "July", "August", "September", "October", "November", "December"};
        
        if (monthNumber >= 1)
        {
            return monthName[(getMonthNumber() - 1)];
        }
        else
        {
            return monthName[getMonthNumber()];
        }
    }
    
    /**
     * Method toString.
     *
     * @return The return value
     */
    public String toString()
    {
        return getMonthName();
    }
    
    /**
     * Method equals.
     *
     * @param month A parameter
     * @return The return value
     */
    public boolean equals(Month month)
    {
        return this.toString().equals(month.toString());
    }
    
    /**
     * Method greaterThan.
     *
     * @param month A parameter
     * @return The return value
     */
    public boolean greaterThan(Month month) 
    {
        if (this.getMonthNumber() > month.getMonthNumber())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Method lessThan.
     *
     * @param month A parameter
     * @return The return value 
     */
    public boolean lessThan(Month month) 
    {
        if (this.getMonthNumber() < month.getMonthNumber())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
