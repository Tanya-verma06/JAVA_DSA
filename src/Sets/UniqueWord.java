package Sets;
import java.util.*;
public class UniqueWord {
    public static void main(String[] args) {
        String str = "She is my Friend and my Friend is so beautiful";
        String[] word= str.split(" ");
        HashSet<String> uniqueWord = new HashSet<>();
        for(String i : word){
            uniqueWord.add(i.toLowerCase());
        }
        System.out.println("Unique words "+ uniqueWord);



    }
}
