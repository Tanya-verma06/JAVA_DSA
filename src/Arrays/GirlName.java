package Arrays;
import java.util.*;
public class GirlName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q =sc.nextInt();
        while(q-- >0){
            int n =sc.nextInt();
            String s =sc.nextLine();
            String t =sc.nextLine();
            char[] sArr=s.toCharArray();
            char[] tArr =t.toCharArray();

            Arrays.sort(sArr);
            Arrays.sort(tArr);
            if(Arrays.equals(sArr,tArr)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}




