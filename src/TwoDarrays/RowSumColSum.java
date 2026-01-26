package TwoDarrays;

import java.util.Scanner;

public class RowSumColSum {
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
        System.out.println("Row sum: ");
        for(int i = 0 ; i< m ; i++){
            int rowsum = 0 ;
            for(int j=0;j<n;j++){
                rowsum+=arr[i][j];

            }
            System.out.println("Row"+ (i+1) + " sum = "+rowsum);
        }
        System.out.println("Column sum : ");
        for(int j = 0 ; j< n; j++) {
            int colsum = 0;
            for (int i = 0; i < m; i++) {
                colsum += arr[i][j];

            }
            System.out.println("column" + (j + 1) + " sum " + colsum);
        }
    }
}
