package Recursion;
import java.util.*;

public class subset {

    public static void solve(String s , int ind,String  sub){
        if(ind==s.length()){
            System.out.println(sub);
            return;
        }
        solve(s,ind+1,sub+s.charAt(ind));
        solve(s,ind+1,sub);

    }


    public static void main(String[] args) {
        String s = "abc";
        solve(s,0,"");

    }
}
