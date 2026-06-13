package BasicMaths;
import java.util.*;
public class PrimeNum {

    static boolean PrimeOrNot(int num){
        for(int i = 2 ; i*i<=num  ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = sc.nextInt();

        System.out.println(PrimeOrNot(num));


    }
}
