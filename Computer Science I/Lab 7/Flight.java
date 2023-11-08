/**
 * Flight.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of Flight class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B
 * @version 1
 */
public class Flight
{
    //Put instance variables below this line.  
    private int flightNumber;
    private String destination;
    private Pilot pilot;
    private String date;
    
    /**
     * No parameter constructor for objects of class Flight.
     */
    public Flight()
    {
        flightNumber = 0;
        destination = "";
        pilot = new Pilot();
        date = "";
        
        
    }
    
    /**
     * Flight Constructor.
     *
     * @param flightNum A parameter
     * @param dest A parameter
     * @param pilo A parameter
     * @param day A parameter
     */
    public Flight(int flightNum, String dest, Pilot pilo, String day)
    {
        flightNumber = flightNum;
        destination = dest;
        pilot = pilo.copy();
        date = day;
    }
    
    /**
     * Method getFlightNumber.
     *
     * @return The return value
     */
    public int getFlightNumber()
    {
        return flightNumber;
    }
    
    /**
     * Method getDestination.
     *
     * @return The return value
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Method getPilot.
     *
     * @return The return value
     */
    public Pilot getPilot()
    {
        return pilot.copy();
    }
    
    /**
     * Method getDate.
     *
     * @return The return value
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * Method setFlightNumber.
     *
     * @param newFlightNumber A parameter
     */
    public void setFlightNumber(int newFlightNumber)
    {
        flightNumber = newFlightNumber;
    }
    
    /**
     * Method setDestination.
     *
     * @param newDestination A parameter
     */
    public void setDestination(String newDestination)
    {
        destination = newDestination;
    }
    
    /**
     * Method setPilot.
     *
     * @param newPilot A parameter
     */
    public void setPilot(Pilot newPilot)
    {
        pilot = newPilot.copy();
    }
    
    /**
     * Method setDate.
     *
     * @param newDate A parameter
     */
    public void setDate(String newDate)
    {
        date = newDate;
    }
    
    /**
     * Method toString.
     *
     * @return The return value
     */
    public String toString()
    {
        return ("Flt#: " + getFlightNumber() + "\tDest: " + getDestination() 
            + "\tPlt: " + getPilot().getName() + "\tDate: " + getDate());
    }
    
    /**
     * Method copy.
     *
     * @return The return value
     */
    public Flight copy()
    {
        return new Flight(flightNumber, destination, pilot, date);
    }

}
