import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigInteger;

public class Lab13_Problem5
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int inputNumber = 0;

        try
        {
            System.out.print("Enter an integer value between 1 and 20: ");
            inputNumber = cin.nextInt(); //Validate for integer input

            if (inputNumber < 1 || inputNumber > 20) //Validate range
            {
                System.out.println("Error: not in range 1 to 20");
                return;
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: not an int");
            return;
        }

        BigInteger factorialResult = fiFactorial(inputNumber); //Calculating factorial
        System.out.println("Factorial of " + inputNumber + " is " + factorialResult);
    }

    public static BigInteger fiFactorial(int pNumber)
    {
        if (pNumber == 1) //Base case
        {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(pNumber).multiply(fiFactorial(pNumber - 1)); //Recursive step
    }
}