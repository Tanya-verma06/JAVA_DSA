package TwoDarrays;
import java.util.*;
public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int m = sc.nextInt();
        System.out.println("enter columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                //System.out.println(max);

            }

        }
        System.out.println("Max value "+ max);



        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }


            }

        }
        System.out.println("Min value= " +min);
    }
}
