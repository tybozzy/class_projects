/**
 * The DistanceTraveled class.
 * 
 * This class stores the speed of a vehicle (in miles per hour) 
 * and the number of hours it has traveled. It should have a 
 * method named getDistance that returns the distance, in miles, 
 * that the vehicle has traveled.
 *
 * @author Tyler B
 * @version 
 */
public class DistanceTraveled
{
    //Put instance variables below this line.  
    private int hours;
    private int speed;
    //Put method(s) below this line. 
    /**
     * DistanceTraveled Constructor.
     *
     */
    public DistanceTraveled()
    {
        hours = 1;
        speed = 0;
    }
    
    /**
     * DistanceTraveled Constructor.
     *
     * @param h A parameter
     * @param s A parameter
     */
    public DistanceTraveled(int h, int s)
    {
        hours = h;
        speed = s;
    }
    
    /**
     * Method setSpeed.
     *
     * @param s A parameter
     */
    public void setSpeed(int s)
    {
        if (speed >= 0)
        {
            speed = s;
        }
        else 
        {
            speed = 0;
        }
    }
    
    /**
     * Method setHours.
     *
     * @param h A parameter
     */
    public void setHours(int h)
    {
        if (h >= 1)
        {
            hours = h;
        }
        else
        {
            hours = 1;
        }
    }
    
    /**
     * Method getHours.
     *
     * @return The return value
     */
    public int getHours()
    {
        return hours;
    }
    
    /**
     * Method getSpeed.
     *
     * @return The return value
     */
    public int getSpeed()
    {
        return speed;
    }
    
    /**
     * Method getDistance.
     *
     * @return The return value
     */
    public int getDistance()
    {
        return hours * speed;
    }
}
