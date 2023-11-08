import java.util.Scanner;
/**
 * Activity1PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 *
 * @author Tyler B
 * @version Sep 13, 2022
 */
public class PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SOCIAL_RATE = 0.1;
    public static final double FED_RATE = 0.2;
    private String name;
    private String ssn;
    private int hours;
    private int overTime;
    private double payRate;
    private double otRate;
    private double regularPay;
    private double overTimePay;
    private double grossPay;
    private double social;
    private double fedTax;
    private double netPay;
    /**
     * Class contructor.
     * @param keyboard 
     */
    public PayStub(Scanner keyboard)
    {
        getInput(keyboard);
        calculate();
    }

    /**
     * Accessor for overTime.
     * @return overTime
     */
    public int getOverTime()
    {
        return overTime;
    }

    /**
     * Accessor for grossPay.
     * @return grossPay
     */
    public double getGrossPay()
    {
        return grossPay;
    }

    /**
     * Mutator for overTime.
     * @param newValue blah blah blah
     */
    public void setOverTime(int newValue)
    {
        if (newValue >= 0)
        {
            overTime = newValue;
            calculate();
        }
    }

    /**
     * Mutator for overTime.
     * @param newValue blah blah blah
     */
    public void setPayRate(double newValue)
    {
        if (newValue >= 0)
        {
            payRate = newValue;
            calculate();
        }
    }

    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        PayStub homer = new PayStub(keyboard);
        PayStub marge = new PayStub(keyboard);
        PayStub lisa = new PayStub(keyboard);
        marge.printPayStub();
        marge.setPayRate(20);
        System.out.printf("New gross pay: $%-8.2f\n", marge.getGrossPay());
    }

    /**
     * Takes and stores input from user.
     * 
     * @param keyboard scanner object used for collecting input.
     */
    private void getInput(Scanner keyboard)
    {
        System.out.print("Enter name: ");
        name = keyboard.nextLine();

        System.out.print("Enter SSN (with hyphens): ");
        ssn = keyboard.nextLine();

        System.out.print("Please enter hours worked (excluding overtime): ");
        hours = keyboard.nextInt();

        System.out.print("Please enter overtime worked: ");
        overTime = keyboard.nextInt();

        System.out.print("Please enter your pay rate: ");
        payRate = keyboard.nextDouble();
        
        keyboard.nextLine();
    }

    /**
     * Calculates rates, pay, and taxes.
     */
    private void calculate()
    {
        otRate = payRate * OVERTIME_RATE;
        regularPay = payRate * hours;
        overTimePay = otRate * overTime;
        grossPay = regularPay + overTimePay;
        social = grossPay * SOCIAL_RATE;
        fedTax = (grossPay - social) * FED_RATE;
        netPay = (grossPay - social) - fedTax;
    }

    /**
     * Prints paystub information.
     */
    public void printPayStub()
    {
        System.out.print("_____________________________________________" 
            + "_______________\n");
        System.out.printf("Name: %-37s SSN: %s\n", name, ssn);
        System.out.printf("Regular Hours: %-8d Reg Rate: " 
            + "$%-8.2f Reg Pay: $%-8.2f\n"
            , hours, payRate, regularPay);
        System.out.printf("Overtime Hours: %-7d OT Rate: " 
            + "$%-9.2f OT Pay: $%-8.2f\n"
            , overTime, otRate, overTimePay);
        System.out.printf("Gross Pay: $%-8.2f\n", grossPay);
        System.out.printf("SS Withholding: $%-8.2f\n", social);
        System.out.printf("Federal Tax: $%-8.2f\n", fedTax);
        System.out.printf("Net Pay: $%-8.2f\n", netPay);
        System.out.println("_____________________________________________" 
            + "_______________");
    }
}
