package Arrays;
import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min= Integer.MAX_VALUE;
        System.out.println("Enter elements");
        for(int i = 0;i<n ;i++){
            arr[i]=sc.nextInt();


        }for(int i = 0; i< n ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest element is: "+min);


    }
}
