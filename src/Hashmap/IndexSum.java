package Hashmap;
import java.util.*;
public class IndexSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        int target = 15;
        HashMap<Integer,Integer> map = new HashMap <>();
        int sum = 0 ;
        int n = arr.length;
        for(int i = 0; i < n ;i ++){
            sum= sum+arr[i];

            if(map.containsKey(sum-target)){
                System.out.println("Found");
            }else{
                map.put(sum,i);
            }
        }
    }
}
