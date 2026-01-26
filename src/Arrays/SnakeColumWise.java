package Arrays;

import java.util.Scanner;

public class SnakeColumWise {
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

        }for(int j = 0 ; j < m ; j++){
            if(j%2==0){
                for(int i = 0 ; i < n ; i++){
                    System.out.println(arr[i][j]);
                }
            }else{
                for(int i = n-1; i>=0 ; i--){
                    System.out.println(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
}
