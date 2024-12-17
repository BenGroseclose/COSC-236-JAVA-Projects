import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab9_Problem1
{
    public static void main(String[] args)
    {
        String sFQFN = "C:\\path\\to\\Lab9_Problem1.txt"; //The Hardcoded file path for prob. 2

        int iLineCount = fiCountLines(sFQFN); //Calling the method to get line count

        if (iLineCount > 0)
        {
            System.out.println("Number of lines: " + iLineCount); 
        }
        else if (iLineCount == 0)
        {
            System.out.println("File is empty"); 
        }
        else
        {
            System.out.println("File not found"); //The Display error if file is missing
        }
    }

    public static int fiCountLines(String pFQFN)
    {
        int iLineCount = 0; 
        Scanner cin = null; 
        DecimalFormat df = new DecimalFormat("000"); //The format for leading zeros

        try
        {
            cin = new Scanner(new File(pFQFN)); //Initializes the Scanner with file

            while (cin.hasNextLine()) 
            {
                String sLine = cin.nextLine(); 
                iLineCount++; 
                System.out.println(df.format(iLineCount) + ": " + sLine); // Display line with formatted number
            }
        }
        catch (FileNotFoundException e)
        {
            return -1; //Returns -1 if file not found
        }
        finally
        {
            if (cin != null) { cin.close(); } 
        }
        
        return iLineCount; 
    }
}
