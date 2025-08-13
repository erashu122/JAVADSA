package DAS_WITH_JAVAADD.Array.TwoDimensionalArray;

public class maltiplicationOfMatrix {
    public static void main(String[] args) {
        int[][] a={{1,1},{2,2},{3,3}};
        int[][] b={{1,1,1},{2,2,2}};
        if (a[0].length!= b.length){
            System.out.println("multiplication is not possible !");

        }else {//if maltiplicatiopn is possible
            int [][] c=new int[a.length][b[0].length];
            for (int i = 0; i <c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        c[i][j]+=a[i][k]*b[k][j];

                    }
                    System.out.print(c[i][j]+" ");

                }
                System.out.println();

            }

        }
    }
}
