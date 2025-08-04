// Addition of two matrix

package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;
public class Addition_of_TwoMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{12,13,14},{15,12,32},{34,45,34}};
        int n=a.length;
        int m=a[0].length;
        int[][] res=new int[n][m];
        System.out.println("with using new matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j]=a[i][j]+b[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("without using any new matrix :->");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]+=b[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//with using new matrix :
//        13 15 17
//        19 17 38
//        41 53 43
//without using any new matrix :->
//        13 15 17
//        19 17 38
//        41 53 43
