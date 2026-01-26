package Arrays;
import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int m =sc.nextInt();
        System.out.println("Enter columns: ");
        int n = sc.nextInt();
        int [][] arr = new int[m][n];
        System.out.println("Enter elements");
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j< n ; j++){
                arr[i][j]=sc.nextInt();
            }
        }int[][] transpose = new int [n][m];
        for(int i = 0 ; i < m; i ++){
            for(int j = 0 ; j < n ; j++){
                transpose[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose matrix : ");
        for(int i = 0; i< n;i++){
            for(int j = 0 ; j< m ;j++){
                System.out.println(transpose[j][i]);
            }
        }

    }
}
