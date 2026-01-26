package Arrays;
import java.util.Scanner;
public class AlternateElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }for(int i= 0; i< n ;i=i+2){
            System.out.print(arr[i]+" ");
        }

    }
}
