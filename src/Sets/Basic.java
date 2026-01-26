package Sets;
import java.util.HashSet;
import java.util.Iterator;
public class Basic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(5);

        System.out.println(set);
        System.out.println("Size of set is : "+set.size());
//        if(set.contains(1)){
//            System.out.println("set contains 1");
//        }if(set.contains(5)){
//            System.out.println("doest not contain 5");
//        }
//        set.remove(2);
//        if(!set.contains(2)){
//            System.out.println(" Set does not contain 2 ");
//        }
        Iterator it  = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }







    }
}
