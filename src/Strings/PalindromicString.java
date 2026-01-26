package Strings;
import java.util.*;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s= sc.nextLine();
        String original = s;
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(original.equals(rev)){
            System.out.println("It is palindromic string");

        }else{
            System.out.println("It is not palindromic");
        }

    }
}
