/*
 * The FootballTeamDemo class.
 * 
 * 
 *
 * @author Tyler B
 * @version V.1
 */
public class FootballTeamDemo
{
    //Put instance variables below this line.  
    /**
     * Main method.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        FootballTeam mountaineers = new FootballTeam("mountaineers", 3 ,5);
        System.out.print(mountaineers.getRecord());
        mountaineers.increaseWins();
        mountaineers.increaseWins();
        mountaineers.increaseWins();
        System.out.print(mountaineers.getRecord());
        
        
        
        
        
    } 

}
