package Recursion;

public class Climbfib {
    public static int climb(int N){
        if(N==0){
            return 0 ;
        }
        if(N==1){
            return 1;
        }
        int one = climb(N-1);
        int two = climb(N-2);

        return one+two;

    }

    public static void main(String[] args) {
        System.out.println(climb(7));
    }
}
