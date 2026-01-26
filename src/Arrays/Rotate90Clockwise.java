package Arrays;
import java.util.*;
public class Rotate90Clockwise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        // Input array elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print original array
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Rotate 90 degree clockwise: (Transpose + Reverse each row)
        // Step 1: Transpose (swap arr[i][j] with arr[j][i])
        int[][] transposed = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        // Step 2: Reverse each row of transposed
        int[][] rotated = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[i][j] = transposed[i][n - 1 - j];
            }
        }

        // Print rotated array
        System.out.println("Rotated Array (90 degree clockwise):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

    }
}

