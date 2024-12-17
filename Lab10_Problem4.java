import java.util.Scanner;
import java.util.Random;

public class Lab10_Problem4 {

    public static void main(String[] args) {
        int[] aiArray = new int[10]; // Declare the array
        Scanner cin = new Scanner(System.in);
        String psUserChoice;

        fvPopulateArray(aiArray, 1, 200); // Populate with random integers
        fvDisplayArray(aiArray, "Native Order"); // Display the original array

        while (true) {
            System.out.print("Enter A for ascending sort, D for descending sort, Q to quit: ");
            psUserChoice = cin.nextLine().toUpperCase();

            if (psUserChoice.equals("A")) {
                fvSortAscending(aiArray);
                fvDisplayArray(aiArray, "Ascending Order");
            } else if (psUserChoice.equals("D")) {
                fvSortDescending(aiArray);
                fvDisplayArray(aiArray, "Descending Order");
            } else if (psUserChoice.equals("Q")) {
                System.out.println("Program exited.");
                break;
            } else {
                System.out.println("Error: type A, D, or Q");
            }
        }
    }

    public static void fvPopulateArray(int[] aiArray, int piMin, int piMax) {
        Random rand = new Random();
        int iIndex;
        for (iIndex = 0; iIndex < aiArray.length; iIndex++) {
            aiArray[iIndex] = rand.nextInt(piMax - piMin + 1) + piMin; //Generates random values
        }
    }

    public static void fvDisplayArray(int[] aiArray, String psCaption) {
        int iIndex;
        System.out.print(psCaption + ": ");
        for (iIndex = 0; iIndex < aiArray.length; iIndex++) {
            System.out.print(aiArray[iIndex] + " ");
        }
        System.out.println();
    }

    public static void fvSortAscending(int[] aiArray) {
        int iIndex, iPass, iTemp, iInterchanges = 0; 
        for (iPass = 0; iPass < aiArray.length - 1; iPass++) {
            for (iIndex = 0; iIndex < aiArray.length - 1 - iPass; iIndex++) {
                if (aiArray[iIndex] > aiArray[iIndex + 1]) {
                    iTemp = aiArray[iIndex];
                    aiArray[iIndex] = aiArray[iIndex + 1];
                    aiArray[iIndex + 1] = iTemp;
                    iInterchanges++; 
                }
            }
        }
        System.out.println("Interchanges required to sort: " + iInterchanges);
    }

    public static void fvSortDescending(int[] aiArray) {
        int iIndex, iPass, iTemp, iInterchanges = 0; //Tracks interchanges
        for (iPass = 0; iPass < aiArray.length - 1; iPass++) {
            for (iIndex = 0; iIndex < aiArray.length - 1 - iPass; iIndex++) {
                if (aiArray[iIndex] < aiArray[iIndex + 1]) {
                    iTemp = aiArray[iIndex];
                    aiArray[iIndex] = aiArray[iIndex + 1];
                    aiArray[iIndex + 1] = iTemp;
                    iInterchanges++; //Counts interchanges
                }
            }
        }
        System.out.println("Interchanges required to sort: " + iInterchanges);
    }
}