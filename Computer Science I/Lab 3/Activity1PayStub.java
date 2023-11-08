import java.util.Scanner;
/**
 * Activity1PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 *
 * @author Tyler B
 * @version Sep 13, 2022
 */
public class Activity1PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SOCIAL_RATE = 0.1;
    public static final double FED_RATE = 0.2;
    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = keyboard.nextLine();

        System.out.print("Social security number (with hyphens): ");
        String ssn = keyboard.nextLine();

        System.out.print("Please enter hours worked excluding overtime: ");
        int hours = keyboard.nextInt();

        System.out.print("Please enter overtime worked: ");
        int overTime = keyboard.nextInt();

        System.out.print("Please enter your pay rate: ");
        double payRate = keyboard.nextDouble();

        double otRate = payRate * OVERTIME_RATE;
        double regularPay = payRate * hours;
        double overTimePay = otRate * overTime;
        double grossPay = regularPay + overTimePay;
        double social = grossPay * SOCIAL_RATE;
        double fedTax = (grossPay - social) * FED_RATE;
        double netPay = (grossPay - social) - fedTax;

        System.out.print("_____________________________________________" 
            + "_______________\n");
        System.out.printf("Name: %-37s SSN: %s\n", name, ssn);
        System.out.printf("Regular Hours: %-8d Reg Rate: $%-8.2f Reg Pay: $%-8.2f\n"
            , hours, payRate, regularPay);
        System.out.printf("Overtime Hours: %-7d OT Rate: $%-9.2f OT Pay: $%-8.2f\n"
            , overTime, otRate, overTimePay);
        System.out.printf("Gross Pay: $%-8.2f\n", grossPay);
        System.out.printf("SS Withholding: $%-8.2f\n", social);
        System.out.printf("Federal Tax: $%-8.2f\n", fedTax);
        System.out.printf("Net Pay: $%-8.2f\n", netPay);
        System.out.println("_____________________________________________" 
            + "_______________");
    }
}
