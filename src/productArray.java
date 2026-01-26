import java.util.Scanner;
public class productArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        int prod=1;
        System.out.println("Enter arrays elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            prod*=arr[i];
        System.out.println(prod);


    }

}
