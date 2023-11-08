import java.util.Scanner;
/**
 * Book class.
 * 
 *
 * @ Tyler B
 * @ V.1
 */
public class Book
{
    //create private fields here
    private String author;
    private String title;
    private int pages;
    private String publisher;
    private String phone;
    
    //create constructor(s) below.
    public Book(Scanner keyboard)
    {
        getInput(keyboard);
        printChart();
    }
    //create accessor methods for fields below.
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
    public String publisher()
    {
        return publisher;
    }
    public String phone()
    {
        return phone;
    }
    
    //create mutator methods for fields below.
    public void setAuthor(String newValue)
    {
        author = newValue;
    }
    public void setTitle(String newValue)
    {
        title = newValue;
    }
    public void setPages(int newValue)
    {
        if (newValue >= 0)
        {
            pages = newValue;
        }
    }
    public void setPublisher(String newValue)
    {
        publisher = newValue;
    }
    public void setPhone(String newValue)
    {
        phone = newValue;
    }
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Book author1 = new Book(keyboard);
        Book author2 = new Book(keyboard);
        Book author3 = new Book(keyboard);
    }
    
    private void getInput(Scanner keyboard)
    {
        System.out.println("Enter author: ");
        author = keyboard.nextLine();
        
        System.out.println("Enter title: ");
        title = keyboard.nextLine();
        
        System.out.println("Enter pages: ");
        pages = keyboard.nextInt();
        
        System.out.println("Enter publisher: ");
        publisher = keyboard.nextLine();
        
        System.out.println("Enter phone number: ");
        phone = keyboard.nextLine();
    }
    
    public void printChart()
    {
        System.out.println("Author____Book____Pages____Publisher____Phone");
        System.out.print(author + " " + title + " " + pages + " "); 
        System.out.println(publisher + " " + phone);
    }
}
