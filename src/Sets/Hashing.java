package Sets;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
         HashMap<String,Integer> map = new HashMap<>();


         map.put("India",120);
         map.put("US", 40);
         map.put("china",150);
         map.put("korea",100);
        System.out.println(map);

//        if(map.containsKey("SriLanka")){
//            System.out.println("Key is present");
//
//
//        }else{
//            System.out.println("Key is not present");
//
//        }
//        System.out.println(map.get("china"));
//        System.out.println(map.get(" SriLanka"));
//        for(Map.Entry<String,Integer> e : map.entrySet()){ //Iteration
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
        map.remove("china");
        System.out.println(map);

//
   }

}
