package Recursion;

public class SumOfDigit {
    public static int SOD(int n){
        if(n==0){
            return 0;

        }
        return n%10 + SOD(n/10);
    }


public static void main(String[] args) {
    System.out.println(SOD(45678));

    }

}