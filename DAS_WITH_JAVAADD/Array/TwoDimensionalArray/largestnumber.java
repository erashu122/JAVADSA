package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

public class largestnumber {
    public static void main(String[] args) {
        int[][] arr={{23,43,12,56},{34,44,87,65},{89,45,136,88}};
        int n=arr.length;
        int m=arr[0].length;
        int mx=Integer.MIN_VALUE;
        mx=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]>mx){
                    mx=arr[i][j];
                }

            }
        }
        System.out.println("The largest number is :"+mx);
    }
}
