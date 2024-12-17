public class Lab13_Problem4
{
    public static void main(String[] args)
    {
        int inputNumber = 6;
        int sum = fiSumDigits(inputNumber); // Call the recursive method
        System.out.println("Sum of the digits from 1 to " + inputNumber + " is " + sum);
    }

    public static int fiSumDigits(int pNumber)
    {
        if (pNumber == 1) // Base case
        {
            return 1;
        }
        return pNumber + fiSumDigits(pNumber - 1); // Recursive step
    }
}