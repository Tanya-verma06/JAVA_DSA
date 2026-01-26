package Arrays;
import java.util.Scanner;
public class CopyArrayIntoOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        System.out.println("Enter values: ");
        for(int i =0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("First arrays Elements:");
        for(int i = 0 ; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nSecond arrays Elements:");
        for(int i = 0; i<n;i++){
            arr1[i]=arr[i];
            System.out.print(arr1[i]+" ");

        }

    }
}
