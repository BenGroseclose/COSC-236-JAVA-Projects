import java.util.ArrayList;
import java.util.Random;

public class Lab13_Problem3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listNums = new ArrayList<>();

        fvPopulateList(listNums);
        fvDisplayHist(listNums);
    }

    public static void fvPopulateList(ArrayList<Integer> pList)
    {
        Random randomGenerator = new Random();
        int currentIndex;
        int randomValue;

        for (currentIndex = 0; currentIndex < 10; currentIndex++)
        {
            randomValue = randomGenerator.nextInt(40) + 1;
            pList.add(randomValue);
        }
    }

    public static void fvDisplayHist(ArrayList<Integer> pList)
    {
        int[] occurrenceCounts = new int[41]; //Array to count occurrences (index 0 isn't used)

        int currentValue;
        for (currentValue = 0; currentValue < pList.size(); currentValue++)
        {
            int listValue = pList.get(currentValue);
            occurrenceCounts[listValue]++;
        }

        int number;
        int asteriskIndex;
        for (number = 1; number < occurrenceCounts.length; number++)
        {
            if (occurrenceCounts[number] > 0)
            {
                System.out.print(number + ": ");
                for (asteriskIndex = 0; asteriskIndex < occurrenceCounts[number]; asteriskIndex++)
                {
                    System.out.print("*");
                }
                System.out.println(" (" + occurrenceCounts[number] + ")");
            }
        }
    }
}