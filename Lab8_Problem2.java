//I thought this problem was fun due to my personal love/interest for video games.
//The ammount of if-elses and incrementing the correct variables challenged me, chatgpt helped with this in finalized version 
import java.util.Random;
import java.util.Scanner;

public class Lab8_Problem2
{
    public static final int giMIN = 1; // Min range for guessing
    public static final int giMAX = 100; // Max range for guessing

    public static void main(String[] args)
    {
        int iPlayerScore = 0; // Counters
        int iComputerScore = 0; 
        int iRound = 1; 
        int iPlayerGuess; 
        
        Scanner cin = new Scanner(System.in);
        System.out.println("Welcome to Michael's Game of Thorns"); // Game intro
        
        do
        {
            System.out.printf("Round %d: Player %d, Computer %d%n", iRound, iPlayerScore, iComputerScore); // Round status
            System.out.printf("Enter a number from %d to %d, negative number to quit: ", giMIN, giMAX); // Players prompt
            iPlayerGuess = cin.nextInt(); 
            
            if (iPlayerGuess < 0) // Exit game if player enters a negative number
            {
                System.out.println("Game Over");
                break;
            }
            else if (iPlayerGuess > giMAX) // Error message for guesses out of range
            {
                System.out.printf("Player's guess is too high. Max is %d. Try again.%n", giMAX);
                continue; // Skip to the next iteration
            }

            int iComputerGuess = generateComputerGuess(); // Generate a random # for computer
            System.out.printf("Player chose %d, computer guessed %d%n", iPlayerGuess, iComputerGuess);

            if (iPlayerGuess == iComputerGuess) //These statements along with increments is where I got caught up.
            {
                iComputerScore++; // Increment computers score on match
            }
            else
            {
                iPlayerScore++; //Increment players score on no match
            }

            iRound++; // Move to the next round

        } while (iPlayerGuess >= 0); 
    }

    public static int generateComputerGuess()
    {
        Random random = new Random();
        return random.nextInt(giMAX - giMIN + 1) + giMIN; // Random number within the range
    }
}