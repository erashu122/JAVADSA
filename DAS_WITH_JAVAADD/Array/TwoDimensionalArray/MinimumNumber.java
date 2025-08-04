package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

public class MinimumNumber {
    public static void main(String[] args) {
        int[][] arr={{-23,-43,-12,-56},{-34,-44,87,65},{89,45,-136,88}};
        int n=arr.length;
        int m=arr[0].length;
        int mi=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]<mi){
                    mi=Math.min(mi,arr[i][j]);
                }

            }
        }
        System.out.println("The Minimum number is :"+mi);
    }
}
