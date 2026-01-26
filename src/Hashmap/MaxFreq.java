package Hashmap;
import java.util.*;
public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,2,4,5,6,5,6,2,1,2,4,5,6,5,4};
        Map<Integer,Integer>freq=new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el)+1);
            }


        }System.out.println("Frequency Hashing");
        System.out.println(freq.entrySet());
        int max = 0;
        int ansKey=-1;
        for(var i : freq.entrySet()){
            if(i.getValue()>max){
                max=i.getValue();
                ansKey=i.getKey();
            }
        }
        System.out.println(ansKey+"="+max);

    }
}
