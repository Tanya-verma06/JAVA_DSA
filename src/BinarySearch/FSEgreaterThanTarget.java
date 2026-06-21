package BinarySearch;

public class FSEgreaterThanTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int target = 5;

        int ans = -1;
        int left=0, right=arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]>target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(arr[ans]);
    }
}
