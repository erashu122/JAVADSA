package DAS_WITH_JAVAADD.logic;

import java.util.Arrays;
import java.util.Scanner;

public class MinmumValu {

        public static void main(String[] args) {
            // Taking input from the user
            Scanner ip = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int n = ip.nextInt();
            System.out.print("Enter number of columns: ");
            int m = ip.nextInt();

            int[][] arr = new int[n][m];

            // Taking elements as input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Enter the element [" + i + "][" + j + "]: ");
                    arr[i][j] = ip.nextInt();
                }
            }

            // Printing the 2D array
            System.out.println("\nThe 2D array is:");
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }

            // Call the max function
            int minValue = min(arr);
            System.out.println("\nThe minimum element is: " + minValue);

            ip.close();
        }

        // Function to find maximum element in 2D array
        static int min(int[][] arr) {
            int min = arr[0][0]; // start with first element

            for (int i = 0; i < arr.length; i++) {           // arr.length → number of rows
                for (int j = 0; j < arr[i].length; j++) {    // arr[i].length → number of columns
                    min = Math.min(min, arr[i][j]);          // use Math.max() to compare
                }
            }

            return min;
        }
    }
