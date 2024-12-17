public class Lab11_Problem2 
{
    public static void main(String[] Args) 
    {
        int iNums[][] = new int[2][3]; 

        fvPop(iNums); 

        fvRowTotal(iNums); 

        fvColTotal(iNums); 

        int iGrandTotal = fiGrandTotal(iNums);
        System.out.println("Grand Total: " + iGrandTotal);

        int iHighest = fiHighest(iNums);
        System.out.println("Highest Value: " + iHighest);

        fvSwapRows(iNums); //Swap and display the rows
    }

    public static void fvPop(int[][] piArray) 
    {
        piArray[0][0] = 23;  
        piArray[0][1] = 21;  
        piArray[0][2] = 62;
        piArray[1][0] = 74;  
        piArray[1][1] = 3;  
        piArray[1][2] = 19;
    }

    public static void fvRowTotal(int[][] piArray) 
    {
        int iRow; 
        int iRowTotal;
        
        for (iRow = 0; iRow < piArray.length; iRow++) 
        {
            iRowTotal = 0; //Initialize total for each row
            for (int iCol = 0; iCol < piArray[iRow].length; iCol++) 
            {
                iRowTotal = iRowTotal + piArray[iRow][iCol];
            }
            System.out.println("Row " + (iRow + 1) + ": " + iRowTotal);
        }
    }

    public static void fvColTotal(int[][] piArray) 
    {
        int iCol; 
        int iColTotal;
        for (iCol = 0; iCol < piArray[0].length; iCol++) 
        {
            iColTotal = 0; //Initialize total for each column
            for (int iRow = 0; iRow < piArray.length; iRow++) 
            {
                iColTotal = iColTotal + piArray[iRow][iCol];
            }
            System.out.println("Col " + (iCol + 1) + ": " + iColTotal);
        }
    }

    public static int fiGrandTotal(int[][] piArray) 
    {
        int iRow; 
        int iCol; 
        int iGrandTotal;
        
        iGrandTotal = 0; //Initialize grand total
        for (iRow = 0; iRow < piArray.length; iRow++) 
        {
            for (iCol = 0; iCol < piArray[iRow].length; iCol++) 
            {
                iGrandTotal = iGrandTotal + piArray[iRow][iCol];
            }
        }
        return iGrandTotal;
    }

    public static int fiHighest(int[][] piArray) 
    {
        int iRow; 
        int iCol; 
        int iHighest;
        
        iHighest = piArray[0][0]; //Start with the first value
        
        for (iRow = 0; iRow < piArray.length; iRow++) 
        {
            for (iCol = 0; iCol < piArray[iRow].length; iCol++) 
            {
                if (piArray[iRow][iCol] > iHighest) 
                {
                    iHighest = piArray[iRow][iCol];
                }
            }
        }
        return iHighest;
    }

    public static void fvSwapRows(int[][] piArray) 
    {
        int iCol; 
        int iTemp;
        
        for (iCol = 0; iCol < piArray[0].length; iCol++) 
        {
            iTemp = piArray[0][iCol]; // Swap values
            piArray[0][iCol] = piArray[1][iCol];
            piArray[1][iCol] = iTemp;
        }

        System.out.print("Row 1: ");
        for (iCol = 0; iCol < piArray[0].length; iCol++) 
        {
            System.out.print(piArray[0][iCol] + " ");
        }
        System.out.println();

        System.out.print("Row 2: ");
        for (iCol = 0; iCol < piArray[1].length; iCol++) 
        {
            System.out.print(piArray[1][iCol] + " ");
        }
        System.out.println();
    }
}
      
       


  