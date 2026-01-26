package Arrays;
import java.util.Scanner;
public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements of an arrays:");
        for(int i = 0; i< n ;i++){
            arr[i]=sc.nextInt();

        }int max = 0;
        int secmax = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }else if(arr[i]>secmax){
                secmax=arr[i];
            }
            //System.out.println("Second maximum number :"+);

        }System.out.println("Second maximum number :"+secmax);


    }
}
