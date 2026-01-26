import java.util.Scanner;
public class NegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an size");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        //for elements input
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        //printing array
        for(int i=0;i<n;i++)
            if(arr[i]<0)
                System.out.print(arr[i]+" ");



    }
}
