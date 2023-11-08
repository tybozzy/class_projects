/**
 * Pilot.java
 * 
 */
 
/**
 * Short, one-line description of Pilot class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B 
 * @version 1
 */
public class Pilot
{
    //Put instance variables below this line.  
    
    private String name;
    private String license;
    
    /**
     * No parameter constructor for objects of class Pilot.
     */
    public Pilot()
    {
        name = "";
        license = "";
    }
    
    /**
     * Pilot Constructor.
     *
     * @param title A parameter
     * @param id A parameter
     */
    public Pilot(String title, String id)
    {
        name = title;
        license = id;
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
     * Method getLicense.
     *
     * @return The return value
     */
    public String getLicense()
    {
        return license;
    }
    
    /**
     * Method setName.
     *
     * @param newName A parameter
     */
    public void setName(String newName)
    {
        if (newName != null)
        {
            name = newName;
        }
        else
        {
            name = "";
        }
    }
    
    /**
     * Method setLicense.
     *
     * @param newLicense A parameter
     */
    public void setLicense(String newLicense)
    {
        if (newLicense != null)
        {
            license = newLicense;
        }
        else
        {
            license = "";
        }
    }
    
    /**
     * Method copy.
     *
     * @return The return value
     */
    public Pilot copy()
    {
        return new Pilot(name, license);
    }
    
    /**
     * Method toString.
     *
     * @return The return value
     */
    public String toString()
    {
        return "Name: " + getName() + " - License: " + getLicense();
        //return str;
    }
    
    /**
     * Method equals.
     *
     * @return The return value
     * @param pilo A parameter
     */
    public boolean equals(Pilot pilo)
    {
        return this.name.equals(pilo.name) && this.license.equals(pilo.license);
    }
}
