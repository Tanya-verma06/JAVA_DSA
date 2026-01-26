package Arrays;
import java.util.*;
public class
BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements: ");
        for(int i = 0 ;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        int st = 0;
        int end = n-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target==mid){
                ans=mid;
                break;
            }
            else if(target>arr[mid]){
                st=mid+1;
            }else{
                end = mid-1;
            }

        }
        if(ans ==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index : "+ ans);
        }
    }
}
