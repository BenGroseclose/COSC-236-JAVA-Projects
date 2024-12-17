import java.util.Scanner;

public class Lab10_Problem2 {

    public static void main(String[] args) {
        String[] wordsArray = {
            "tester", "James", "pill", "justice", 
            "character", "fairness", "princess", 
            "help", "book", "chair"
        }; // Declare and populate the array

        String userInput;
        boolean isFound = false; // Flag to track if the word is found

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        userInput = scanner.nextLine(); // Get user input

        for (int index = 0; index < wordsArray.length; index++) {
            if (wordsArray[index].equalsIgnoreCase(userInput)) { // Case-insensitive comparison
                isFound = true;
                break; // Stop searching if a match is found
            }
        }

        if (isFound) {
            System.out.println("The word '" + userInput + "' was found.");
        } else {
            System.out.println("The word '" + userInput + "' was not found.");
        }
    }
}