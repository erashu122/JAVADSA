package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

public class maxOfEachColumn1
{
    void alterArr(int [][] arr, int [][] mcol) {
        for(int col=0;col<arr[0].length;col++) {
            mcol[col][0] = arr[0][col];
            for (int row=0; row<arr.length;row++){
                if(mcol[col][0] < arr[row][col]) {
                    mcol[col][0] = arr[row][col];
                    mcol[col][1] = row;
                }
            }
        }
    }
    public static void main (String[] args)
    {
        int arr[][] = { {1, 4, 6},{10, 2, 8},{7, 5, 3}};
        int mcol[][] = new int[3][3];
        maxOfEachColumn1 s= new maxOfEachColumn1();
        s. alterArr(arr, mcol);
        for(int row=0; row<mcol.length;row++) {
            for (int col=0;col<mcol[0].length;col++) {
                System.out.print(mcol[row][col]+ " ");
            }
            System.out.println();
        }
    }
}