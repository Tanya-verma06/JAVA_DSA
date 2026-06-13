package BasicMaths;
import java.util.*;
public class ReverseNum {

    static int Rev(int n){

        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int ans = Rev(n);
        System.out.println("Reverse number = " + ans);

    }
}
