package BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 5;

        int ans = -1;
        int left=0, right=arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(target>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(ans==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(ans);
        }
    }
}
