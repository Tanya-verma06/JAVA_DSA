package TwoDarrays;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows: ");
        int m = sc.nextInt();
        System.out.print("enter columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    sum+=arr[i][j];


                }

            }

        }System.out.println("sum= " + sum);
    }
}
