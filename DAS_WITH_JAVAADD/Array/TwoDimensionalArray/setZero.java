package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

public class setZero {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1 ,1},
                {1, 1, 0, 1},
                {3, 0, 1, 1},
                {1, 1, 1 ,1}
        };

        int m = a.length;
        int n = a[0].length;

        // Make a copy of the array to check for original zeroes
        int[][] ashu = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ashu[i][j] = a[i][j];
            }
        }

        // Set rows and columns to 0 based on the copy
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ashu[i][j] == 0) {
                    // Set entire row to 0
                    for (int k = 0; k < n; k++) {
                        a[i][k] = 0;
                    }
                    // Set entire column to 0
                    for (int l = 0; l < m; l++) {
                        a[l][j] = 0;
                    }
                }
            }
        }

        // Print final result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}