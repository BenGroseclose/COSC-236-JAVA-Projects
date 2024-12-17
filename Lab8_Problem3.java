import java.util.Scanner;

public class Lab8_Problem3
{
    public static void main(String[] args)
    {
        String sAns; // Stores the user's menu choice
        
        System.out.println("Welcome to the Captive Menu Program!"); 
        
        do // loop to continue until the user chooses to quit
        {
            sAns = getUserChoice(); // Call "child" method to get a valid choice from the user

            if (sAns.equals("A"))
            {
                System.out.println("User selected A - First option"); // Handle option A
            }
            else if (sAns.equals("B"))
            {
                System.out.println("User selected B - Second option"); // Handle option B
            }
            else if (sAns.equals("C"))
            {
                System.out.println("User selected C - Third option"); // Handle option C
            }
            else if (!sAns.equals("Q"))
            {
                System.out.println("Error: Invalid menu choice; try again."); // error for invalid input
            }

        } while (!sAns.equals("Q")); // Loop until the user quits

        System.out.println("Thank you for using the Captive Menu Program!"); 
    }

    public static String getUserChoice() // "Child" method that will display the menu, get the user's choice then return it
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("\nMenu Choices:"); // Displaying menu header with option A and B below
        System.out.println("A - First option"); 
        System.out.println("B - Second option");
        System.out.println("C - Third option"); // Option C
        System.out.println("Q - Quit this application"); // Quit option
        System.out.print("Selection: "); // Prompt for input

        return cin.next().toUpperCase(); // Capture input, convert to uppercase, and return
    }
}