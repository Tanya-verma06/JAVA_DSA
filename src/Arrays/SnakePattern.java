package Arrays;

import java.util.Scanner;

public class SnakePattern {
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
        for(int i=0; i < n ; i++){
            if(i % 2 == 0){
                for(int  j = 0 ; j < m ; j++ ){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j = m-1 ; j>= 0 ; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }

        }

    }
}
