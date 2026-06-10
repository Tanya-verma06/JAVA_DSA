package Recursion;
import java.util.*;
public class SubsetArraylist {

    public static void solve(String s, int ind , String sub , ArrayList<String>arr){
        if(ind==s.length()){
            arr.add(sub);
            return;
        }
        solve(s,ind+1,sub+s.charAt(ind),arr);
        solve(s,ind+1,sub,arr);

    }

    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<String>();
        String s = "abcd";
        solve(s,0,"",arr);
        System.out.println(arr);

    }
}
