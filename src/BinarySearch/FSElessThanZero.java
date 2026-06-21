package BinarySearch;

public class FSElessThanZero {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-2,-4};


        int ans = -1;
        int left=0, right=arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]<0){
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
