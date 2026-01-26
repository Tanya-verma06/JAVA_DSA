package Arrays;
import java.util.*;
public class MaxRowSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter rows:");
        int n = sc.nextInt();
        System.out.println("Enter columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j< m ; j++){
                arr[i][j] = sc.nextInt();

            }
        }int max = 0 ;
        int row =-1;
        for(int i = 0 ; i < n ; i ++){
            int sum = 0 ;
            for(int j = 0 ; j < m ; j ++){
                sum+=arr[i][j];


            }if(sum>max){
                max=sum;
                row=i;
            }
        }
        System.out.println(row+":"+ max);
    }
}
