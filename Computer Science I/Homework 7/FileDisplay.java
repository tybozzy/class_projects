import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The FileDisplay class.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileDisplay
{
    private File file;
    /**
     * FileDisplay Constructor.
     *
     * @param filename A parameter
     */
    public FileDisplay(String filename) throws IOException
    {
        this.file = new File(filename);
    }

    /**
     * Method displayHead.
     *
     * @return The return value
     */
    public void displayHead()
    {
        try
        {
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                count++;
                if (count <= 5)
                {
                    System.out.println(line);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Method displayContents.
     *
     * @return The return value
     */
    public void displayContents()
    {
        try
        {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Method displayWithLineNumbers.
     *
     * @return The return value
     */
    public void displayWithLineNumbers()
    {
        try
        {
            Scanner scanner = new Scanner(file);
            int count = 1;
            while (scanner.hasNextLine())
            {
                System.out.println(count + ": " + scanner.nextLine());
                count++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
