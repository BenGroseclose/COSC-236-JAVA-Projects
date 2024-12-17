import java.util.Random;

public class Lab10_Problem5 {

    public static void main(String[] args) {
        int[] aiArray = new int[10]; //Declares the array
        fvPopulateArray(aiArray, 1, 100); 
        fvDisplayArray(aiArray, "Original Order"); 

        fvSelectionSort(aiArray); //Sorts the array using selection sort
        fvDisplayArray(aiArray, "Sorted Order"); //Displays the sorted array
    }

    public static void fvPopulateArray(int[] aiArray, int piMin, int piMax) {
        Random rand = new Random();
        int iIndex;
        for (iIndex = 0; iIndex < aiArray.length; iIndex++) {
            aiArray[iIndex] = rand.nextInt(piMax - piMin + 1) + piMin; // Populate with random values
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

    public static void fvSelectionSort(int[] aiArray) {
        int iPass, iIndex, iMinIndex, iTemp, iInterchanges = 0;

        for (iPass = 0; iPass < aiArray.length - 1; iPass++) {
            iMinIndex = iPass; //Assumes the first unsorted element is the smallest
            for (iIndex = iPass + 1; iIndex < aiArray.length; iIndex++) {
                if (aiArray[iIndex] < aiArray[iMinIndex]) {
                    iMinIndex = iIndex; //Updates index of smallest element
                }
            }
            if (iMinIndex != iPass) {
                iTemp = aiArray[iPass];
                aiArray[iPass] = aiArray[iMinIndex];
                aiArray[iMinIndex] = iTemp;
                iInterchanges++; //Counts interchanges
            }
        }
        System.out.println("Interchanges required to sort: " + iInterchanges);
    }
}