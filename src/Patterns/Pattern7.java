package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int n = sc.nextInt();
        System.out.println("Enter colums: ");
        int m = sc.nextInt();

        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
