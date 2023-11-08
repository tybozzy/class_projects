/**
 * Customer.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of Customer class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B 
 * @version 1 
 */
public class Customer
{
    //Put instance variables below this line.  
    
    private String name;
    private String ssn;
    
    /**
     * Customer Constructor.
     *
     * @param title A parameter
     * @param social A parameter
     */
    public Customer(String title, String social)
    {
        if (title != null)
        {
            name = title;
        }
        else
        {
            name = "";
        }
        if (social != null)
        {
            ssn = social;
        }
        else
        {
            ssn = "";
        }
    }
    
    /**
     * No parameter constructor for objects of class Customer.
     * 
     * @param customer A parameter
     */
    public Customer(Customer customer)
    {
        this.name = customer.name;
        this.ssn = customer.ssn;
    }
    
    /**
     * Method getName.
     *
     * @return The return value
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method getSsn.
     *
     * @return The return value
     */
    public String getSsn()
    {
        return ssn;
    }
    
    /**
     * Method setName.
     *
     * @param newName A parameter
     */
    public void setName(String newName)
    {
        if (name != null)
        {
            name = newName;
        }
        else
        {
            name = "";
        }
    }
    
    /**
     * Method setSsn.
     *
     * @param newSsn A parameter
     */
    public void setSsn(String newSsn)
    {
        if (name != null)
        {
            ssn = newSsn;
        }
        else
        {
            ssn = "";
        }
    }
    
    /**
     * Method toString.
     *
     * @return The return value
     */
    public String toString()
    {
        return "Name: " + getName() + " - SSN: " + getSsn();
    }

}
