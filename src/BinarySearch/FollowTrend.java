package BinarySearch;

public class FollowTrend {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,10,4,8};

        int ans = -1;
        int left=0, right=arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]%2==0){
                ans=mid;
                right=mid-1;
            }
            else{
              left=mid+1;
            }
        }
        System.out.println(ans);

    }
}
