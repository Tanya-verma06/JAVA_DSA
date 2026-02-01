package Recursion;

public class ReverseNum {


//    static int sum=0;
//
//    public static void rev1(int n){
//        if(n==0){
//            return;
//        }
//        int rem = n%10;
//        sum=sum*10+rem;
//        rev1(n/10);
//
//
//    }


    // second method by using helper function

    public static int rev2(int n){
        int dig = (int)(Math.log10(n))+1;
        return helper(n,dig);
    }
    private static int helper(int n , int dig){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,dig-1)) + helper(n/10 , dig-1);
    }



    public static void main(String[] args) {
        System.out.println(rev2(54321));


    }
    //public static void main(String[] args){
    //rev1(1234);
    //System.out.println(sum);


}
