package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

public class Add2D_Array {
    public static void main(String[] args) {
        int[][] arr={{23,43,12,56},{34,44,87,65},{89,45,136,88}};
        int n=arr.length;
        int m=arr[0].length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum+=arr[i][j];

            }

        }
        System.out.println( "Total sum of 2D Array is:"+sum);
    }
}
