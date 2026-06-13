package BitwiseOperators;
import java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if((n&(n-1))==0){
            System.out.println("Power of 2");
        }else {
            System.out.println("Not power of 2");
        }

    }
}
