/**
 * Ticket.java
 * 
 */

/**
 * Short, one-line description of Ticket class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B 
 * @version 1
 */
public class Ticket
{
    //Put instance variables below this line.  
    
    private Customer customer;
    private Flight flight;
    
    /**
     * Parameter constructor for objects of class Ticket.
     * 
     * @param cust A parameter
     * @param fligh A parameter
     */
    public Ticket(Customer cust, Flight fligh)
    {
        customer = new Customer(cust);
        flight = fligh.copy();
    }
    
    /**
     * Method getCustomer.
     *
     * @return The return value
     */
    public Customer getCustomer()
    {
        return new Customer(customer);
    }
    
    /**
     * Method getFlight.
     *
     * @return The return value
     */
    public Flight getFlight()
    {
        return flight.copy();
    }
    
    /**
     * Method setCustomer.
     *
     * @param newCustomer A parameter
     */
    public void setCustomer(Customer newCustomer)
    {
        customer = new Customer(newCustomer);
    }
    
    /**
     * Method setFlight.
     *
     * @param newFlight A parameter
     */
    public void setFlight(Flight newFlight)
    {
        flight = newFlight.copy();
    }
    
    /**
     * Method toString.
     *
     * @return The return value
     */
    public String toString()
    {
        return ("******** TICKET ********"
            + "\n* Name: " + getCustomer().getName()
            + "\n* SSN: " + getCustomer().getSsn()
            + "\n* Flight: " + getFlight().getFlightNumber()
            + "\n* Date: " + getFlight().getDate()
            + "\n* Destination: " + getFlight().getDestination()
            + "\n************************");
        
    }

}
