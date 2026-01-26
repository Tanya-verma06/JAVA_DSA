package ArrayList;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(12);
        arr.add(45);
        arr.add(100);
        arr.set(1,6);
        Collections.sort(arr);
        for(int i = 0 ; i<arr.size(); i++){
            System.out.println(arr.get(i));

        }

    }
}
