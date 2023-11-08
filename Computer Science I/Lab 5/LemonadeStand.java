/**
 * LemonadeStand.java
 * 
 */


//Put any imports below this line.

 
/**
 * Short, one-line description of LemonadeStand class here.
 *
 * @author Tyler B
 * @version V.1
 */
public class LemonadeStand
{
    private int lemons;
    private int gallonsOfWater;
    private int cupsOfSugar;
    private int emptyGlasses;
    private int glassesOfLemonade;
    private double price;
    private double income;
    private int cupsSold;
    
    public LemonadeStand()
    {
        lemons = 0;
        gallonsOfWater = 0;
        cupsOfSugar = 0;
        emptyGlasses = 0;
        glassesOfLemonade = 0;
        price = 0;
        income = 0;
    }
    
    public LemonadeStand(int newLemons, int newGallonsOfWater, int newCupsOfSugar, 
            int newEmptyGlasses, double newPrice)
    {
        setLemons(newLemons);
        setGallonsOfWater(newGallonsOfWater);
        setCupsOfSugar(newCupsOfSugar);
        setEmptyGlasses(newEmptyGlasses);
        setPrice(newPrice);
        glassesOfLemonade = 0;
        income = 0;
    }
    
    public int getLemons()
    {
        return lemons;
    }
    public int getGallonsOfWater()
    {
        return gallonsOfWater;
    }
    public int getCupsOfSugar()
    {
        return cupsOfSugar;
    }
    public int getEmptyGlasses()
    {
        return emptyGlasses;
    }
    public int getGlassesOfLemonade()
    {
        return glassesOfLemonade;
    }
    public double getPrice()
    {
        return price;
    }
    public double getIncome()
    {
        return income;
    }
    
    public void setLemons(int newLemons)
    {
        if (newLemons < 0)
        {
            lemons = 0;
        }
        else
        {
            lemons = newLemons;
        }
    }
    public void setGallonsOfWater(int newGallonsOfWater)
    {
        if (newGallonsOfWater < 0)
        {
            gallonsOfWater = 0;
        }
        else
        {
            gallonsOfWater = newGallonsOfWater;
        }
    }   
    public void setCupsOfSugar(int newCupsOfSugar)
    {
        if (newCupsOfSugar < 0)
        {
            cupsOfSugar = 0;
        }
        else
        {
            cupsOfSugar = newCupsOfSugar;
        }
    }
    public void setEmptyGlasses(int newEmptyGlasses)
    {
        if (newEmptyGlasses < 0)
        {
            emptyGlasses = 0;
        }
        else
        {
            emptyGlasses = newEmptyGlasses;
        }
    }
    public void setGlassesOfLemonade(int newGlassesOfLemonade)
    {
        if (newGlassesOfLemonade < 0)
        {
            glassesOfLemonade = 0;
        }
        else
        {
            glassesOfLemonade = newGlassesOfLemonade;
        }
    }
    public void setPrice(double newPrice)
    {
        if (newPrice < 0)
        {
            price = 0;
        }
        else
        {
            price = newPrice;
        }
    }
    public void setIncome(double newIncome)
    {
        if (newIncome  < 0)
        {
            income = 0;
        }
        else
        {
            income = newIncome;
        }
    }
    
    /**
     * Method makeLemonade
     *
     * @return glassesOfLemonade the total glassesOfLemonade
     */
    public int makeLemonade()
    {
        if (lemons >= 6 && gallonsOfWater >= 1 && cupsOfSugar >= 1 && 
            emptyGlasses >= 8)
        {
            
            lemons -= 6;
            --gallonsOfWater;
            --cupsOfSugar;
            emptyGlasses -= 8 ;
            glassesOfLemonade += 8;
        }
        return glassesOfLemonade;
    }
    
    /**
     * Method sellLemonade
     *
     * @return cupsSold the amount of cups that were sold
     */
    public int sellLemonade()
    {
        if (glassesOfLemonade <= 0)
        {
            makeLemonade();
        }
        
        if (glassesOfLemonade > 0)
        {
            --glassesOfLemonade;
            income += price;
            cupsSold += 1;
        }
        
        return cupsSold;
    }
    
    public int sellMoreLemonade(int requestedGlasses)
    {
        if (requestedGlasses > 8 || requestedGlasses 
            >= glassesOfLemonade)
        {
            income = (price * glassesOfLemonade);
            cupsSold += glassesOfLemonade;
            glassesOfLemonade = 0;
        }
        return cupsSold;
    }
    
    /**
     * Method main
     *
     * @param args command line arguments
     */
    public static void main(String args[])
    {
        //LemonadeStand lemonadeStand = new LemonadeStand(15, 3, 4, 20, 1.5);
        LemonadeStand lemonadeStand = new LemonadeStand();
        lemonadeStand.makeLemonade();
        System.out.println(lemonadeStand.getLemons());
        System.out.println(lemonadeStand.getGallonsOfWater());
        System.out.println(lemonadeStand.getCupsOfSugar());
        System.out.println(lemonadeStand.getGlassesOfLemonade());
        
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
    }
}
