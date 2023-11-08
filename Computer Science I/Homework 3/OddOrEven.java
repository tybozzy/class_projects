import java.util.Scanner;
/**
 * OddOrEven class.
 * 
 * Recieves a number from user and decides whether it is even or odd.
 *
 * @ Tyler B
 * @ V.1
 */
public class OddOrEven
{
    //create main method below.
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter an integer: \n");
        int x = keyboard.nextInt();
        
        if (x % 2 == 0)
        {
            System.out.print("The input is even");
        }
        else 
        {
            System.out.print("The input is odd");
        }
    }
}