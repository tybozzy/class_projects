/**
 * PowerBall.java
 * 
 */


//Put any imports below this line.
import java.util.Random; 
 
/**
 * Program that supports the tax of the poor and uneducated.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author Tyler B
 * @version 1.0
 */
public class PowerBall
{
    private Random randomGenerator = new Random();
    public static final int MAX_LOTTERY_NUMBER = 59;
    public static final int MAX_POWER_BALL_NUMBER = 35;
    private int number0;
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int powerBall;
    
    /**
     * PowerBall Constructor.
     *
     */
    public PowerBall()
    {
        number0 = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
    }
    
    /**
     * Method getNumber0.
     *
     * @return The return value
     */
    public int getNumber0()
    {
        return number0;
    }
    
    /**
     * Method getNumber1.
     *
     * @return The return value
     */
    public int getNumber1()
    {
        return number1;
    }
    
    /**
     * Method getNumber2.
     *
     * @return The return value
     */
    public int getNumber2()
    {
        return number2;
    }
    
    /**
     * Method getNumber3.
     *
     * @return The return value
     */
    public int getNumber3()
    {
        return number3;
    }
    
    /**
     * Method getNumber4.
     *
     * @return The return value
     */
    public int getNumber4()
    {
        return number4;
    }
    
    /**
     * Method getPowerBall.
     *
     * @return The return value
     */
    public int getPowerBall()
    {
        return powerBall;
    }
    
    /**
     * Method getRandomGenerator.
     *
     * @return The return value
     */
    public Random getRandomGenerator()
    {
        return randomGenerator;
    }
    
    /**
     * Method setRandomGenerator.
     *
     * @param newRandom A parameter
     */
    public void setRandomGenerator(Random newRandom)
    {
        randomGenerator = newRandom;
    }

    /**
     * Method setNumber0.
     *
     * @param newNum0 A parameter
     */
    public void setNumber0(int newNum0)
    {
        number0 = newNum0;
    }
    
    /**
     * Method setNumber1.
     *
     * @param newNum1 A parameter
     */
    public void setNumber1(int newNum1)
    {
        number1 = newNum1;
    }
    
    /**
     * Method setNumber2.
     *
     * @param newNum2 A parameter
     */
    public void setNumber2(int newNum2)
    {
        number2 = newNum2;
    }
    
    /**
     * Method setNumber3.
     *
     * @param newNum3 A parameter
     */
    public void setNumber3(int newNum3)
    {
        number3 = newNum3;
    }
    
    /**
     * Method setNumber4.
     *
     * @param newNum4 A parameter
     */
    public void setNumber4(int newNum4)
    {
        number4 = newNum4;
    }
    
    /**
     * Method setPowerBall.
     *
     * @param newPowerB A parameter
     */
    public void setPowerBall(int newPowerB)
    {
        powerBall = newPowerB;
    }
    
    /**
     * Method generateLotteryNumber.
     *
     * @return The return value
     */
    public int generateLotteryNumber()
    {
        return randomGenerator.nextInt(MAX_LOTTERY_NUMBER) + 1;
    }
    
    /**
     * Method generatePowerBallNumber.
     *
     * @return The return value
     */
    public int generatePowerBallNumber()
    {
        return randomGenerator.nextInt(MAX_POWER_BALL_NUMBER) + 1;
    }
    
    /**
     * Method isDuplicateLotteryNumber.
     *
     * @param newNumber A parameter
     * @return The return value
     */
    public boolean isDuplicateLotteryNumber(int newNumber)
    {
        if (newNumber == number0 || newNumber == number1 || newNumber == number2
            || newNumber == number3 || newNumber == number4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Method nextLotteryNumber.
     *
     * @return The return value
     */
    public int nextLotteryNumber()
    {
        int num = generateLotteryNumber();
        while (isDuplicateLotteryNumber(num) == true)
        {
            num = generateLotteryNumber();
        }
        return num;
    }
    
    /**
     * Method reset.
     *
     */
    public void reset()
    {
        number0 = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        powerBall = 0;
    }
    
    /**
     * Method generateLotteryPicks.
     *
     */
    public void generateLotteryPicks()
    {
        reset();
        number0 = nextLotteryNumber();
        number1 = nextLotteryNumber();
        number2 = nextLotteryNumber();
        number3 = nextLotteryNumber();
        number4 = nextLotteryNumber();
        powerBall = generatePowerBallNumber();
    }
    
    /**
     * Method toString.
     *
     * @return The return value
     */
    public String toString()
    {
        return String.format("%02d, %02d, %02d, %02d, %02d, Powerball %02d", 
            number0, number1, number2, number3, number4, powerBall);
    }
}
