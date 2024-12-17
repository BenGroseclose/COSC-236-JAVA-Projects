import java.util.Scanner;

public class Lab10_Problem3 {

    public static void main(String[] args) {
        int[] arrValues = {47, 93, 108, 173, 4, 38, 62, 87, 19, 11};
        Scanner cin = new Scanner(System.in);
        String userChoice;

        displayArray(arrValues, "Native Order");

        while (true) {
            System.out.print("Enter L for left shift, R for right, Q to quit: ");
            userChoice = cin.nextLine().toUpperCase();

            if (userChoice.equals("L")) {
                shiftArray(arrValues, "L");
                displayArray(arrValues, "Left Shifted");
            } else if (userChoice.equals("R")) {
                shiftArray(arrValues, "R");
                displayArray(arrValues, "Right Shifted");
            } else if (userChoice.equals("Q")) {
                System.out.println("Program exited.");
                break;
            } else {
                System.out.println("Error: type L, R, or Q");
            }
        }
    }

    public static void displayArray(int[] arrValues, String caption) {
        int index;
        System.out.print(caption + ": ");
        for (index = 0; index < arrValues.length; index++) {
            System.out.print(arrValues[index] + " ");
        }
        System.out.println();
    }

    public static void shiftArray(int[] arrValues, String direction) {
        int index;
        if (direction.equals("L")) {
            int temp = arrValues[0];
            for (index = 0; index < arrValues.length - 1; index++) {
                arrValues[index] = arrValues[index + 1];
            }
            arrValues[arrValues.length - 1] = temp;
        } else if (direction.equals("R")) {
            int temp = arrValues[arrValues.length - 1];
            for (index = arrValues.length - 1; index > 0; index--) {
                arrValues[index] = arrValues[index - 1];
            }
            arrValues[0] = temp;
        }
    }
}