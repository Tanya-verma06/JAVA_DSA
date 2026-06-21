package BinarySearch;

public class SqrRoot {
    public static void main(String[] args) {

        int N = 100000000;

        int ans = -1;
        int left=1, right = N;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(mid>=N/mid){
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
