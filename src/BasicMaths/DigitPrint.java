package BasicMaths;

public class DigitPrint {

    static void Digits(int n){

        while(n!=0){
            int digit = n%10;
            System.out.println("Digits are:"+digit);
            n=n/10;
        }

    }


    public static void main(String[] args) {
        int n = 1206;
        Digits(n);

    }

}
