public class Sales
{
    public static void main(String[] args)
    {
        System.out.println("Enter a purchase amount: ");
        double purchaseAmount = Given.getDouble();
        final double stateTax = 0.05;
        final double countyTax = 0.03;
        final double totalTax = 0.08;

        System.out.println("Amount of Purchase: " + "\t" + "$" + purchaseAmount);
        System.out.println("State Sales Tax Paid: " +"\t" + "$"+ purchaseAmount * stateTax);
        System.out.println("County Sales Tax Paid: "+"\t" + "$" + purchaseAmount * countyTax);
        System.out.println("Total Sales Tax Paid: "+"\t" + "$" + purchaseAmount * totalTax);
        System.out.println("Total Sales Price: " + "\t" + "$" + (purchaseAmount + purchaseAmount * totalTax));

    }
}