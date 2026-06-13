package BitwiseOperators;

import java.util.*;
public class CountsetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int count=0;
        while(n!=0){
            if((n&1)!=0){
                count++;
            }
            n>>=1;
        }
        System.out.println("Count bits = "+ count);
    }
}
