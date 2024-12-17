import java.util.Scanner;

public class Lab8_Problem4
{
    public static void main(String[] args)
    {
        int iRadial; // User's radial input
        String sGate; // Gate result
        String sFrequency; //Frequency result
        
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter radial: ");
        iRadial = cin.nextInt();
        
        if (!isValidRadial(iRadial)) // Check if the input is in valid range
        {
            System.out.println("Invalid radial: range is between 1 and 360"); 
        }
        else
        {
            sGate = determineGate(iRadial); // Get gate based on radial
            sFrequency = determineFrequency(iRadial); // Get frequency based on radial
            System.out.println(sGate + " on " + sFrequency); 
        }
    }

    public static boolean isValidRadial(int iRadial)
    {
        return iRadial >= 1 && iRadial <= 360; // Radial has to be within 1–360
    }

    public static String determineGate(int iRadial)
    {
        if (iRadial >= 341) return "Use WOOLY"; 
        else if (iRadial >= 310) return "Use LUCKE"; 
        else if (iRadial >= 270) return "Use JASEN"; 
        else if (iRadial >= 237) return "Use FLUKY"; 
        else if (iRadial >= 215) return "Use BRV"; 
        else if (iRadial >= 173) return "Use GRUBY"; 
        else if (iRadial >= 120) return "Use WHINO"; 
        else if (iRadial >= 47) return "Use PALEO"; 
        else return "Use WOOLY"; // WOOLY is the default for radials below 47
    }

    public static String determineFrequency(int iRadial)
    {
        if (iRadial >= 341 || iRadial <= 46) return "132.775"; // Frequency for WOOLY/PALEO
        else if (iRadial >= 310 || iRadial >= 270 || iRadial >= 237 || iRadial >= 215) return "127.325"; // Frequency for other gates
        else return "125.125"; // Frequency for GRUBY/WHINO
    }
}