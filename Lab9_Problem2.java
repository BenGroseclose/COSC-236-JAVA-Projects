import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab9_Problem2
{
    public static void main(String[] args)
    {
        String sFQFN = "C:\\path\\to\\Lab9_Problem1.txt"; 
        
        int iTokenCount = fiCountTokens(sFQFN); //Method call to count tokens and store the result in iTokenCount
        
        if (iTokenCount > 0) 
        {
            System.out.println("Number of tokens: " + iTokenCount);
        }
        else if (iTokenCount == 0)
        {
            System.out.println("Warning: File's empty");
        }
        else
        {
            System.out.println("Error: No File");
        }
    }

    public static int fiCountTokens(String pFQFN) //The Method to count tokens in the file
    {
        int iTokenCount = 0; //Token counter
        Scanner cin = null; 
        
        try
        {
            cin = new Scanner(new File(pFQFN)); 
                      
            while (cin.hasNext()) //Read tokens instead of lines
            {
                String sToken = cin.next(); //Get next token and store in sToken
                iTokenCount++; 
            }
        }
        catch (FileNotFoundException e)
        {
            return -1; //Return -1 if the files not found
        }
        finally
        {
            if (cin != null)
            {
                cin.close(); 
            }
        }
        
        return iTokenCount; //Return the final token count
    }
}