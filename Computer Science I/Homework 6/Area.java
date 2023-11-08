import java.lang.Math;
/**
 * The Area class.
 * 
 * This program has three overloaded static methods 
 * for calculating the areas of the circles, 
 * rectangles, and cylinders.
 *
 * @author Tyler B 
 * @version 1.0
 */
public class Area
{
    /**
     * Method getArea.
     *
     * @param r A parameter
     * @return The return value
     */
    public static double getArea(double r)
    {
        return Math.PI * Math.pow(r, 2);
    }
    
    /**
     * Method getArea.
     *
     * @param width A parameter
     * @param length A parameter
     * @return The return value
     */
    public static int getArea(int width, int length)
    {
        return width * length;
    }
    
    /**
     * Method getArea.
     *
     * @param r A parameter
     * @param height A parameter
     * @return The return value
     */
    public static double getArea(double r, double height)
    {
        return Math.PI * Math.pow(r, 2) * height;
    }
}
