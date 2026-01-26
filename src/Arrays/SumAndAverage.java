package Arrays;
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i =0;i< n ;i++){
            arr[i]=sc.nextInt();

        }int sum =0;
        int avg = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            avg =sum/n;
        }
        System.out.println("sum is " + sum + "average is "+ avg );

    }
}
