public class Lab13_Problem6 {

    public static void main(String[] args) {
        int[] iArr = {3, 19, 4, 7, 1};

        fvDisplayArray(iArr);
        int iInterchanges = fiRecursiveSort(iArr);
        fvDisplayArray(iArr);
        System.out.println("Total Interchanges: " + iInterchanges);
    }

    public static void fvDisplayArray(int[] piArr) {
        int iIndex;
        for (iIndex = 0; iIndex < piArr.length; iIndex++) System.out.print(piArr[iIndex] + " ");
        System.out.println();
    }

    public static int fiRecursiveSort(int[] piArr) {
        int iIndex, iInterchanges = 0;
        boolean bSorted = true;

        for (iIndex = 0; iIndex < piArr.length - 1; iIndex++) {
            if (piArr[iIndex] > piArr[iIndex + 1]) {
                int temp = piArr[iIndex];
                piArr[iIndex] = piArr[iIndex + 1];
                piArr[iIndex + 1] = temp;
                bSorted = false;
                iInterchanges++;
            }
        }

        if (bSorted) return iInterchanges;
        return iInterchanges + fiRecursiveSort(piArr);
    }
}