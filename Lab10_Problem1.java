import java.util.Random;

public class Lab10_Problem1 {

    public static void main(String[] args) {
        int[] examScores = new int[50];
        int scoreIndex;
        int scoreValue;

        int countGradeA = 0, countGradeB = 0, countGradeC = 0, countGradeD = 0, countGradeF = 0;

        Random randomGenerator = new Random();
        for (scoreIndex = 0; scoreIndex < examScores.length; scoreIndex++) {
            examScores[scoreIndex] = randomGenerator.nextInt(101); //Generates random scores
        }

        for (scoreIndex = 0; scoreIndex < examScores.length; scoreIndex++) {
            scoreValue = examScores[scoreIndex];
            if (scoreValue >= 90) countGradeA++;
            else if (scoreValue >= 80) countGradeB++;
            else if (scoreValue >= 70) countGradeC++;
            else if (scoreValue >= 60) countGradeD++;
            else countGradeF++; //Increments count for grades
        }

        System.out.println("Grade Distribution");
        System.out.println("A: " + countGradeA);
        System.out.println("B: " + countGradeB);
        System.out.println("C: " + countGradeC);
        System.out.println("D: " + countGradeD);
        System.out.println("F: " + countGradeF); // Output grade F count
    }
}