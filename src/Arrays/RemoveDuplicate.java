//package Arrays;
//import java.util.Scanner;
//public class RemoveDuplicate {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter Arrays elements: ");
//        for(int i = 0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }int x = 0;
//        for(int i=1; i<n;i++){
//            if(arr[i]!=arr[x]){
//                x=x+1;
//                arr[x]=arr[i];
//            }
//        }
//        for(int i = 0 ; i<= x ;i++){
//            System.out.print(arr[i]+" ");
//
//        }
//        //System.out.println(arr[x]+" ");
//
//
//    }
//}
import java.util.*;

public class RemoveDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int x = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[x]) {
                x++;
                arr[x] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= x; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}