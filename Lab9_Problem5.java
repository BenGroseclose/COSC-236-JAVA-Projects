import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab9_Problem5
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in); 
        System.out.print("Enter the full path for the file: ");
        String sFQFN = cin.nextLine(); 

        try
        {
            PrintWriter ofsOut = new PrintWriter(new FileWriter(sFQFN, true));
            ofsOut.println("This is appended text."); 
            ofsOut.close(); 

            if (fiDisplayContents(sFQFN) == 0) 
            {
                System.out.println("Error: File not found during append check.");
            }

            ofsOut = new PrintWriter(new FileWriter(sFQFN)); // Overwrite mode
            ofsOut.println("This is fresh content after wiping."); //To Write new content
            ofsOut.close(); 

            if (fiDisplayContents(sFQFN) == 0) //Checks if displays successful after overwrite
            {
                System.out.println("Error: File not found during overwrite check.");
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: Couldn't access file " + sFQFN); //Error messagee if the file can't be accessed
        }

        cin.close(); 
    }

    public static int fiDisplayContents(String pFQFN)
    {
        try (Scanner fileScanner = new Scanner(new java.io.File(pFQFN))) //Opens the file for reading
        {
            while (fileScanner.hasNextLine()) 
            {
                System.out.println(fileScanner.nextLine()); 
            }
            return 1; //Return 1 if it's successful
        }
        catch (IOException e)
        {
            return 0; //Returns 0 if file not found
        }
    }
}