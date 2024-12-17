import java.text.DecimalFormat;

public class Lab11_Problem4 
{
    public static void main(String[] args) 
    {
        int[][] iVals = {
            {3, 7, 1, 4},
            {9, 4, 8, 2},
            {9, 5},
            {4, 0, 5, 8}
        };

        fvDisplayArray(iVals);
        
        int iCount = fiCountElements(iVals);
        System.out.println("Count (n): " + iCount);

        double dMean = fdCalculateMean(iVals);
        System.out.println("Mean: " + formatDecimal(dMean));

        double dSumOfSquares = fdCalculateSumOfSquares(iVals, dMean);
        System.out.println("Sum of squares: " + formatDecimal(dSumOfSquares));

        double dVariance = fdCalculateVariance(dSumOfSquares, iCount);
        System.out.println("Variance: " + formatDecimal(dVariance));

        double dStdDev = fdCalculateStdDev(dVariance);
        System.out.println("Standard deviation: " + formatDecimal(dStdDev));
    }

    public static void fvDisplayArray(int[][] piVals) 
    {
        int iRow;
        int iCol;
        
        for (iRow = 0; iRow < piVals.length; iRow++) 
        {
            for (iCol = 0; iCol < piVals[iRow].length; iCol++) 
            {
                System.out.print(piVals[iRow][iCol] + " "); //print row
            }
            System.out.println(); //new line
        }
    }

    public static int fiCountElements(int[][] piVals) 
    {
        int iRow;
        int iCol;
        int iCount;
        
        iCount = 0;
        for (iRow = 0; iRow < piVals.length; iRow++) 
        {
            iCount = iCount + piVals[iRow].length; //increment count
        }
        return iCount;
    }

    public static double fdCalculateMean(int[][] piVals) 
    {
        int iRow;
        int iCol;
        int iSum;
        int iCount;
        double dMean;
        
        iSum = 0;
        iCount = 0;
        for (iRow = 0; iRow < piVals.length; iRow++) 
        {
            for (iCol = 0; iCol < piVals[iRow].length; iCol++) 
            {
                iSum = iSum + piVals[iRow][iCol]; // add to sum
                iCount = iCount + 1; // add to count
            }
        }
        dMean = (double) iSum / iCount;
        return dMean;
    }

    public static double fdCalculateSumOfSquares(int[][] piVals, double pdMean) 
    {
        int iRow;
        int iCol;
        double dSumOfSquares;
        double dDiff;
        
        dSumOfSquares = 0.0;
        for (iRow = 0; iRow < piVals.length; iRow++) 
        {
            for (iCol = 0; iCol < piVals[iRow].length; iCol++) 
            {
                dDiff = piVals[iRow][iCol] - pdMean; // difference
                dSumOfSquares = dSumOfSquares + (dDiff * dDiff); // add square
            }
        }
        return dSumOfSquares;
    }

    public static double fdCalculateVariance(double pdSumOfSquares, int piCount) 
    {
        double dVariance;
        dVariance = pdSumOfSquares / (piCount - 1); // sample variance
        return dVariance;
    }

    public static double fdCalculateStdDev(double pdVariance) 
    {
        double dStdDev;
        dStdDev = Math.sqrt(pdVariance); // std deviation
        return dStdDev;
    }

    private static String formatDecimal(double value) 
    {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(value);
    }
}











