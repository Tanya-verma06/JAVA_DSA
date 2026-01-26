package Strings;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
        }
        else{
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not anagram");
            }
        }

    }
}
