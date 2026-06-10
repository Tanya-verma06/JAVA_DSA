package Methods;
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        sum();

    }
   public  static void sum(){
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter number 1:");
       int a = sc.nextInt();

       System.out.println("Enter number 2:");
        int b = sc.nextInt();

        int add = a+b;

       System.out.println("Sum :" + add);

    }
}
