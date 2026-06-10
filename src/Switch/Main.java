package Switch;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit");
        String fruit = sc.next();
        switch(fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("red fruit");
                break;
            case "grapes" :
                System.out.println("small fruit");
                break;
            default:
                System.out.println("please enter valid fruit");

        }

    }
}
