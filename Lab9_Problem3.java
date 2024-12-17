import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lab9_Problem3
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in); 
        Random rand = new Random(); 

        System.out.print("Number of random integers to generate (negative number to quit): ");
        int iNumValues = cin.nextInt(); //Gets the number of integers to generate

        if (iNumValues >= 1) 
        {
            System.out.print("FQFN for the file where the output will be stored: ");
            String sFQFN = cin.next(); //Gets the file path from user

            try
            {
                PrintStream ofsOut = new PrintStream(sFQFN); //Makesoutput stream for file
                 
                int iCounter;
                
                for (iCounter = 0; iCounter < iNumValues; iCounter++) //Creates and writed integers
                {
                    int iRandomValue = rand.nextInt(101); //Random integer between 0 and 100
                    ofsOut.println(iRandomValue); //Writes integer to file
                }

                ofsOut.close(); 
                System.out.println("File " + sFQFN + " has been created with " + iNumValues + " random integers.");
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Error: Can't create file at " + sFQFN); //Handle file creation error
            }
        }
        else
        {
            System.out.println("No values generated. This Program will be destroyed."); //The display message if input is < 1
        }

        cin.close(); 
    }
}
