import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab9_Problem4
{
    public static void main(String[] args)
    {
        String sFQFN = "C:\\Users\\YourUsername\\OneDrive\\COSC 236\\Lab9_Problem3.txt"; 
        
        int iCount = fiCountNumbers(sFQFN); 
        double dSum = fdCalculateSum(sFQFN); 

        if (iCount >= 0 && dSum >= 0) //Checks if file was read successfully
        {
            DecimalFormat df = new DecimalFormat("0.00"); 
            double dMean = (iCount > 0) ? (dSum / iCount) : 0; 
            
            System.out.println("File: " + sFQFN);
            System.out.println("Count: " + iCount); 
            System.out.println("Sum: " + df.format(dSum)); 
            System.out.println("Mean: " + df.format(dMean)); 
        }
        else
        {
            System.out.println("Error: Couldn't read file at " + sFQFN); 
        }
    }

    public static int fiCountNumbers(String pFQFN)
    {
        int iCount = 0; 
        Scanner cin = null; 
        
        try
        {
            cin = new Scanner(new File(pFQFN)); 
            
            while (cin.hasNextInt()) 
            {
                cin.nextInt(); 
                iCount++; 
            }
        }
        catch (FileNotFoundException e)
        {
            return -1; 
        }
        finally
        {
            if (cin != null) { cin.close(); } 
        }
        
        return iCount; 
    }

    public static double fdCalculateSum(String pFQFN)
    {
        double dSum = 0; 
        Scanner cin = null; 
        
        try
        {
            cin = new Scanner(new File(pFQFN)); 
            
            while (cin.hasNextInt()) 
            {
                int iTemp = cin.nextInt();
                dSum = dSum + iTemp;
            }
        }
        catch (FileNotFoundException e)
        {
            return -1; 
        }
        finally
        {
            if (cin != null) { cin.close(); } 
        }
        
        return dSum; 
    }
}