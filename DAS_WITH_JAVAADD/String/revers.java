package DAS_WITH_JAVAADD.String;

import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = sc.nextLine();

        // Split the string into words
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }

        // Trim extra space and print
        System.out.println("Output: " + result.toString().trim());
    }
}
