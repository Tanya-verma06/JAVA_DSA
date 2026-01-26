package Strings;
import java.util.*;
public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int length=0;
        int i =s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        System.out.println("Length of last word : " +length);
    }
}
