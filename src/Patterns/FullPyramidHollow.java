package Patterns;

import java.util.Scanner;

public class FullPyramidHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars
            if (i == 1) {
                System.out.print("* ");
            } else {
                System.out.print("* ");

                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = 1; row <= n - 1; row++) {

            // Leading spaces
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }

            if (row == n - 1) {
                System.out.print("* ");
            } else {

                // First star
                System.out.print("* ");

                // Middle spaces
                for (int j = 1; j <= 2 * (n - row) - 3; j++) {
                    System.out.print("  ");
                }

                // Second star
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}