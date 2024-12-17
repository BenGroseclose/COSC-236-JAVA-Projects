import java.util.Scanner;

public class Lab8_Problem5
{
    public static void main(String[] args)
    {
        double[] dValues = {5.8, 7.2, 9.1, 6.7, 4.0}; 
        
        double dMean = fdCalculateMean(dValues); // Calculate mean
        double dVariance = fdCalculateVariance(dValues, dMean); // Calculate variance using mean
        double dStdDeviation = fdCalculateStandardDeviation(dVariance); // Calculate standard deviation
        
        System.out.println("Mean: " + dMean); 
        System.out.println("Variance: " + dVariance); 
        System.out.println("Standard Deviation: " + dStdDeviation); 
    }

    public static double fdCalculateMean(double[] dValues) // First "child" method to calculate mean
    {
        double dSum = 0.0; // Sum accumulator
        for (double dValue : dValues)
        {
            dSum += dValue; // Accumulate total of the values
        }
        return dSum / dValues.length; // Returns mean
    }

    public static double fdCalculateVariance(double[] dValues, double dMean)// Second "child" method to calculate variance
    {
        double dSumOfSquares = 0.0; // Sum of squares accumulator
        for (double dValue : dValues)
        {
            dSumOfSquares += Math.pow(dValue - dMean, 2); // Accumulate squared deviations
        }
        return dSumOfSquares / (dValues.length - 1); // Return variance (using n-1 for sample variance)
    }

    public static double fdCalculateStandardDeviation(double dVariance)// Third child method to calculate standard deviation
    {
        return Math.sqrt(dVariance); 
    }
}