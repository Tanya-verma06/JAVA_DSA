package BasicMaths;

import java.util.Scanner;

public class Palindrome {

    static int Rev(int num){

        int rev = 0;
        while(num!=0){
            int rem = num%10;
            rev = rev*10+rem;
            num/=10;
        }
        return rev;
    }
    static boolean Palin(int num){
        int OriginalNum = num ;
        int revNum = Rev(num);

        return OriginalNum==revNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int ans = Rev(num);
        if(Palin(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }

}
