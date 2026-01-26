package Arrays;

import java.util.*;

public class MinElementOfEachRow {
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
        }int MinOfMax= Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int RowMax = Integer.MIN_VALUE;
            for(int j = 0 ; j <m; j++){
                RowMax= Math.max(RowMax,arr[i][j]);
            }
            MinOfMax= Math.min(MinOfMax,RowMax);
        }
        System.out.println("Minimun of Row Maximum : "+ MinOfMax);


    }
}