 /**
 * The FootballTeam class.
 *
 * @author Tyler B
 * @version 1
 */
public class FootballTeam
{
    //Put instance variables below this line.  
    private String teamName;
    private int numOfWins;
    private int numOfLosses;
    //Put methods below this line.
    
    public FootballTeam(String n, int w, int l)
    {
       teamName = n;
       numOfWins = w;
       numOfLosses = l;
    }
    
    public String getTeamName()
    {
        return teamName;
    }
    public int getNumOfWins()
    {
        return numOfWins;
    }
    public int getNumOfLosses()
    {
        return numOfLosses;
    }
    
    public void increaseWins()
    {
        numOfWins += 1;
    }
    public void increaseLosses()
    {
        numOfLosses += 1;
    }
    
    public boolean getRecord()
    {
        if (numOfWins > numOfLosses)
        {
            return true;
        }
        else if (numOfLosses > numOfWins)
        {
            return false;
        }
        return false;
    }

}
