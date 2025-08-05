package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

public class rowAndColumeWisePrinting {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{5,7,5}};
        int n=a.length;
        int m=a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] transpose = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = a[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


    }
}
