import java.util.Scanner;
public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size"+ " ");
        int n =sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.println("Enter arrays elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }for(int i=0;i<n;i++){
            sum+=arr[i];

        }
        System.out.println(sum);


    }
}
