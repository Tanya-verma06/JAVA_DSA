package WindowSliding;

public class maxSumArray {

    class Main {
        public static int maxSumArray(int[] arr , int k){
            int maxSum=0;
            int sum = 0;
            int start = 0;


            for(int end = 0 ; end<arr.length ; end++){
                sum=sum+arr[end];
                if(end>=k){
                    maxSum = Math.max(sum,maxSum);
                    sum = sum-arr[start];
                }
            }
            return maxSum;
        }



        public static void main(String[] args) {
            int[] arr = {2,1,5,1,3,2};
            int k = 3;
            int result = maxSumArray(arr,k);
            System.out.println(result);

        }
    }
}
