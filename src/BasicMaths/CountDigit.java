package BasicMaths;

public class CountDigit {

    static int Digits(int n){

        int count=0;
        while(n!=0){
            int digit = n%10;
            count++;
            n=n/10;
        }
        return count;

    }


    public static void main(String[] args) {
        int n = 1206;
        int ans = Digits(n);
        System.out.println("Digits = " + ans);

    }
}
