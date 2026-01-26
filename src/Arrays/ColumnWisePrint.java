package Arrays;

import java.util.Scanner;

public class ColumnWisePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int n = sc.nextInt();
        System.out.println("Enter columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }


        }
        for(int  j = 0 ; j<m;j++){
            for(int i = 0 ; i < n ; i++){
                System.out.print( arr[i][j]+" ");
            }
        }
        System.out.println();

    }
}