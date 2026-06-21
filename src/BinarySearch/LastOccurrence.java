package BinarySearch;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,4,4,5};
        int target = 4;

        int ans = -1;
        int left=0, right=arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==target){
                ans=mid;
                left=left+1;
            }
            else if(target>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(ans==-1){
            System.out.println("insertion position : "+left);
        }
        else{
            System.out.println(ans);
        }
    }
}
