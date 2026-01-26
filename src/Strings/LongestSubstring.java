package Strings;
import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        int start=0;
        int end =0;
        int max_length=0;
        List<Character> list = new ArrayList<Character>();
        while(end<str.length()){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                max_length=Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(str.charAt(start)));
                start++;

            }

        }
        System.out.println("Maximum length is :"+ max_length);


    }
}
