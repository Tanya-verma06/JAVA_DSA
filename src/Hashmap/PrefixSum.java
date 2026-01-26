package Hashmap;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int[] prefix=new int[n];
        int sum = 0;
        for(int i = 0 ; i < n ; i ++){
            sum+=arr[i];
            prefix[i]=sum;
        }
        int[][] Q= {{2,3},{1,5}, {3,7}};
        for(int[] pair : Q){
            int Start = pair[0];
            int end = pair[1];
            int range = prefix[end]-prefix[Start-1];
            System.out.println(range);
        }

    }
}
