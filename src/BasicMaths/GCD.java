package BasicMaths;

public class GCD {

    static int Gcd(int a, int b){
      while(b!=0){
          int temp = b;
          b = a % b;
          a = temp;
      }
      int ans = a;
      return ans;
    }

    public static void main(String[] args) {
        System.out.println(Gcd(18,12));
    }
}
