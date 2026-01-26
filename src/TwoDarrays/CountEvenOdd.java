package TwoDarrays;

import java.util.Scanner;

public class CountEvenOdd {
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
        int CountEven = 0;
        int CountOdd=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]%2==0){
                    CountEven++;
                }else{
                    CountOdd++;
                }
            }
        }
        System.out.println("Even count = " + CountEven);
        System.out.println("Odd count = " +CountOdd);
    }
}
